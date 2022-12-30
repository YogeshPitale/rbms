package com.wf.stp.rbms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wf.stp.rbms.dto.upo.Upo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@Slf4j
public class RuleBasedMessageSanitizerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(RuleBasedMessageSanitizerApplication.class, args);
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("sample/usecase1.json");
		Upo upo = new ObjectMapper().readValue(is, Upo.class);
		upo.getPmtInf().getComWellsfargoEpdUpoAvroPmtInf().getAmt().getComWellsfargoEpdUpoAvroAmt().getDbtAmt().getComWellsfargoEpdUpoAvroDbtAmt().getAmt().getString();
		upo.getPmtInf().getComWellsfargoEpdUpoAvroPmtInf().getAmt().getComWellsfargoEpdUpoAvroAmt().getCdtAmt().getComWellsfargoEpdUpoAvroCdtAmt().getAmt().getString();
		upo.getPmtInf().getComWellsfargoEpdUpoAvroPmtInf().getDbtrAgt().getComWellsfargoEpdUpoAvroDbtrAgt().getFinInstnId2().getComWellsfargoEpdUpoAvroFinInstnId2().setUschu("FED");
		upo.getPmtInf().getComWellsfargoEpdUpoAvroPmtInf().getCdtrAgt().getComWellsfargoEpdUpoAvroCdtrAgt().getFinInstnId2().getComWellsfargoEpdUpoAvroFinInstnId2().setUschu("FED");
		log.info("Payment Rail: "+upo.getWfPmtOrdrPrcg().getComWellsfargoEpdUpoAvroWfPmtOrdrPrcg().getPmtRail().getString());
    }

}
