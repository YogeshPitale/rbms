package com.wf.stp.rbms.service;

import com.wf.stp.rbms.config.TrackingRuleFiredEventListener;
import com.wf.stp.rbms.dto.upo.Upo;
import lombok.extern.slf4j.Slf4j;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class UpoDroolsService {

    @Autowired
    private ApplicationContext appContext;

    public Upo getTransformedUpo(Upo upo, Optional<String> agendaGroup) {
        KieContainer kieContainer = (KieContainer) appContext.getBean("kieContainer");
        KieSession kieSession = kieContainer.newKieSession();
        TrackingRuleFiredEventListener agendaEventListener = new TrackingRuleFiredEventListener();
        kieSession.addEventListener(agendaEventListener);
        if(!agendaGroup.isEmpty())
            kieSession.getAgenda().getAgendaGroup(agendaGroup.get()).setFocus();
        kieSession.insert(upo);
        kieSession.fireAllRules();
        List<String> activations = agendaEventListener.getActivationList();
        log.info("No of rules fired:"+ activations.size());
        for(String rule : activations)
        {
            log.info(rule);
        }
        kieSession.getAgenda().getAgendaGroup( "DEBIT" ).clear();
        agendaEventListener.reset();
        kieSession.dispose();
        return upo;
    }
}
