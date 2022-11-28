package com.wf.stp.rbms.listener.service;

import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.router.RuleService;
import com.wf.stp.rbms.util.RbmsUTIL;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.stereotype.Service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
@Slf4j
public class ServiceRouter {

    private static final String BASE_PACKAGE="com.wf.stp.rbms";

    public Upo applySanitization(Upo upoIn) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Upo upoOut = upoIn;
        List<Class<?>> routerClasses = RbmsUTIL.findAllRoutingClasses(BASE_PACKAGE);
        log.info("No of classes:"+routerClasses.size());
        for(Class clazz:routerClasses) {
            log.info("Current class name:"+clazz.getName());
            Constructor<?> constructor = clazz.getConstructor();
            RuleService router = (RuleService)constructor.newInstance();
            if(router.verify(upoIn)){
                log.info("Applying Transformation");
                upoOut=router.applyTransformation(upoIn);
            }else
                log.info("Transformation not required");
        }
        return upoOut;
    }

    public static void main(String[] args) {
        try {
            new ServiceRouter().applySanitization(new Upo());
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
