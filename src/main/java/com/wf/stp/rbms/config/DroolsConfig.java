package com.wf.stp.rbms.config;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.JarURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

@Configuration
public class DroolsConfig {
    // Reading from resources:
    private static final String RULES_CUSTOMER_RULES_DRL = "rules/upo-rules.drl";
    private static final String RULES_CUSTOMER_RULES_XLSX = "rules/upo-rules.xlsx";
    // Reading from URL(GitHub):
    private static final String RULES_CUSTOMER_RULES_XLSX_URL = "https://github.com/monil-persistent/Drools_Rules/blob/main/upo-rules.xls?raw=true";
    private static final String RULES_CUSTOMER_RULES_DRL_URL = "https://github.com/monil-persistent/Drools_Rules/raw/main/upo-rules.drl";
    // Reading from File System:
//    private static final File RULES_CUSTOMER_RULES_DRL_FTP = new File("drl-file-path");
//    private static final File RULES_CUSTOMER_RULES_XLSX_FTP = new File("xlsx-file-path");
    private static final KieServices kieServices = KieServices.Factory.get();

    @Bean
    public KieContainer kieContainer() throws IOException {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
//        kieFileSystem.write(ResourceFactory.newClassPathResource(RULES_CUSTOMER_RULES_XLSX));
        kieFileSystem.write(ResourceFactory.newUrlResource(RULES_CUSTOMER_RULES_XLSX_URL));
//        kieFileSystem.write(ResourceFactory.newFileResource(RULES_CUSTOMER_RULES_XLSX_FTP));
        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        return kieContainer;
    }
}
