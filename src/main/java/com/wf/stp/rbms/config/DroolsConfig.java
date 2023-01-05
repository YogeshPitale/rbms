package com.wf.stp.rbms.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DroolsConfig {

    @Value("${RULES_CUSTOMER_RULES_XLSX_URL}")
    private String RULES_CUSTOMER_RULES_XLSX_URL;
    @Value("${RULES_CUSTOMER_RULES_DRL_URL}")
    private String RULES_CUSTOMER_RULES_DRL_URL;
    @Value("${AGENDA_GROUPS_URL}")
    private String AGENDA_GROUPS_URL;

    private static final KieServices kieServices = KieServices.Factory.get();

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @RefreshScope
    public KieContainer kieContainer() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_DRL_URL));
        // kieFileSystem.write(ResourceFactory.newClassPathResource(AGENDA_GROUPS_URL));
        // kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_XLSX_URL));
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        return kieContainer;
    }
}
