package com.wf.stp.rbms.service;

import com.wf.stp.rbms.dto.upo.Upo;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpoDroolsService {

    @Autowired
    private KieContainer kieContainer;

    public Upo getTransformedUpo(Upo upo) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(upo);
        kieSession.fireAllRules();
        kieSession.dispose();
        return upo;
    }
}
