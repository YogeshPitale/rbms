package com.wf.stp.rbms.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
@RefreshScope
// @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DroolsConfig {
    // Reading from resources:
    @Value("${RULES_CUSTOMER_RULES_DRL}")
    private String RULES_CUSTOMER_RULES_DRL;
    @Value("${RULES_CUSTOMER_RULES_XLSX}")
    private String RULES_CUSTOMER_RULES_XLSX;
    // Reading from URL(GitHub):
    @Value("${RULES_CUSTOMER_RULES_XLSX_URL}")
    private String RULES_CUSTOMER_RULES_XLSX_URL;
    @Value("${RULES_CUSTOMER_RULES_DRL_URL}")
    private String RULES_CUSTOMER_RULES_DRL_URL;
    // Reading from File System:
    @Value("${RULES_CUSTOMER_RULES_DRL_FTP_PATH}")
    private String RULES_CUSTOMER_RULES_DRL_FTP_PATH;
    @Value("${RULES_CUSTOMER_RULES_XLSX_FTP_PATH}")
    private String RULES_CUSTOMER_RULES_XLSX_FTP_PATH;

    @Value("${AGENDA_GROUPS_URL}")
    private String AGENDA_GROUPS_URL;

    @Value("${AGENDA_GROUPS_URL_LOCAL}")
    private String AGENDA_GROUPS_URL_LOCAL;

    //    private final File RULES_CUSTOMER_RULES_DRL_FTP = new File(RULES_CUSTOMER_RULES_DRL_FTP_PATH);
    //    private final File RULES_CUSTOMER_RULES_XLSX_FTP = new File(RULES_CUSTOMER_RULES_XLSX_FTP_PATH);
    private static final KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer kieContainer() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_DRL));
        kieFileSystem.write(ResourceFactory.newClassPathResource(AGENDA_GROUPS_URL_LOCAL));
//        kieFileSystem.write(ResourceFactory.newFileResource(RULES_CUSTOMER_RULES_XLSX_FTP));
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        return kieContainer;
    }
}
