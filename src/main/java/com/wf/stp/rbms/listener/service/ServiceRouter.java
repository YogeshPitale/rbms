package com.wf.stp.rbms.listener.service;

import com.wf.stp.rbms.dto.dto.UpoDto;
import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.repository.UpoRepository;
import com.wf.stp.rbms.router.RuleService;
import com.wf.stp.rbms.router.ServicePriority;
import com.wf.stp.rbms.util.RbmsUTIL;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ServiceRouter {

    private static final String BASE_PACKAGE = "com.wf.stp.rbms";

    @Autowired
    private UpoRepository upoRepository;
    @Autowired
    private ApplicationContext context;

    public UpoDto applySanitization(UpoDto upoIn) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        UpoDto upoOut = upoIn;

        DozerBeanMapper mapper = new DozerBeanMapper();
        Upo upo = mapper.map(upoOut, Upo.class);
        upoRepository.save(upo);

        List<Class<?>> routerClasses = RbmsUTIL.findAllRoutingClasses(BASE_PACKAGE);
        log.info("No of classes:" + routerClasses.size());
        for (int priority : ServicePriority.getServicePriorityMap().keySet()) {
            Class clazz = routerClasses.stream().filter(aClass -> aClass.getCanonicalName().equalsIgnoreCase(ServicePriority.getServicePriorityMap().get(priority))).collect(Collectors.toList()).get(0);
            log.info("Current class name:" + clazz.getName());
            RuleService service = (RuleService) context.getBean(clazz);
            if (service.verify(upoOut)) {
                log.info("Applying Transformation");
                upoOut = service.applyTransformation(upoOut);
            } else
                log.info("Transformation not required");
        }

        mapper = new DozerBeanMapper();
        Upo upo1 = mapper.map(upoOut, Upo.class);
        upoRepository.save(upo1);

        return upoOut;
    }

    public static void main(String[] args) {
        try {
            new ServiceRouter().applySanitization(new UpoDto());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void handleRecovery(ConsumerRecord<String, String> consumerRecord) {

    }
}
