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

    @Value("${AGENDA_GROUPS_URL}")
    private String AGENDA_GROUPS_URL;

    @Value("${AGENDA_GROUPS_URL_LOCAL}")
    private String AGENDA_GROUPS_URL_LOCAL;

    //    private final File RULES_CUSTOMER_RULES_DRL_FTP = new File(RULES_CUSTOMER_RULES_DRL_FTP_PATH);
    //    private final File RULES_CUSTOMER_RULES_XLSX_FTP = new File(RULES_CUSTOMER_RULES_XLSX_FTP_PATH);
    private static final KieServices kieServices = KieServices.Factory.get();

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @RefreshScope
    public KieContainer kieContainer() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        //kieFileSystem.write(ResourceFactory.newUrlResource(AGENDA_GROUPS_URL));
        kieFileSystem.write(ResourceFactory.newClassPathResource(AGENDA_GROUPS_URL_LOCAL));
        //kieFileSystem.write(ResourceFactory.newFileResource(RULES_CUSTOMER_RULES_XLSX_FTP));
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        return kieContainer;
    }
}
