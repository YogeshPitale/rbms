package com.wf.stp.rbms;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@Slf4j
public class RuleBasedMessageSanitizerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RuleBasedMessageSanitizerApplication.class, args);
	/*	ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("sample/usecase1.json");
		Upo upo = new ObjectMapper().readValue(is,Upo.class);
		log.info("Payment Rail: "+upo.getWfPmtOrdrPrcg().getComWellsfargoEpdUpoAvroWfPmtOrdrPrcg().getPmtRail().getString());*/
    }

}
