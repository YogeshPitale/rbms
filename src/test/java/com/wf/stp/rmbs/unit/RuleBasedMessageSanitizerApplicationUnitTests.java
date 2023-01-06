package com.wf.stp.rmbs.unit;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wf.stp.rbms.RuleBasedMessageSanitizerApplication;
import com.wf.stp.rbms.dto.upo.Upo;
import com.wf.stp.rbms.listener.service.ServiceRouter;
import com.wf.stp.rbms.listener.service.test.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = RuleBasedMessageSanitizerApplication.class)
@AutoConfigureMockMvc
@DisplayName("STP Unit tests")
@Slf4j
public class RuleBasedMessageSanitizerApplicationUnitTests {

    @Autowired
    private TestService testService;

    @Autowired
    private ServiceRouter serviceRouter;

    private static final Path SERVICE_ROUTER_TESTCASE_DIR = Path.of("src\\test\\resources\\unit_test_cases\\service_router\\input");

    @Test
    void unitTestForServiceRouter() throws IOException {
        Files.walk(SERVICE_ROUTER_TESTCASE_DIR).forEach(path -> {
            if (!path.toFile().isDirectory()) {
                String fileName = path.getFileName().toString();
                log.info("Filename:" + fileName);
                Upo inputUpo = getUPO("unit_test_cases/service_router/input/", fileName).get();
                log.info("i/p upo:" + inputUpo);
                Upo response = null;
                try {
                    response = serviceRouter.applySanitization(inputUpo);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                Upo expectedUpo = getUPO("unit_test_cases/service_router/expected_op/", fileName).get();
                boolean isReponseMatching = false;
                try {
                    String strExpected = new ObjectMapper().writeValueAsString(expectedUpo);
                    String strResponse = new ObjectMapper().writeValueAsString(response);
                    isReponseMatching = strExpected.equalsIgnoreCase(strResponse);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                log.info("Test case for unit_test_cases/service_router/input/" + fileName + " passed:" + isReponseMatching);
                assertTrue(isReponseMatching, "Positive Test Case");
            }
        });
    }

    @Test
    public void unitTestForTestService() throws Exception {
        String fileName = "testcase1.json";
        log.info("Filename:" + fileName);
        Upo inputUpo = getUPO("unit_test_cases/test_service/input/", fileName).get();
        log.info("i/p upo:" + inputUpo);

        assertTrue(testService.verify(inputUpo));

        String expectedOpFileName = "testcase1.json";
        Upo expectedUpo = getUPO("unit_test_cases/test_service/expected_op/", expectedOpFileName).get();
        Upo response = testService.applyTransformation(inputUpo);

        String strExpected = new ObjectMapper().writeValueAsString(expectedUpo);
        String strResponse = new ObjectMapper().writeValueAsString(response);
        boolean isReponseMatching = strExpected.equalsIgnoreCase(strResponse);
        log.info("OP File Path:" + expectedOpFileName);

        log.info("Test case for unit_test_cases/test_service/input/" + fileName + " passed:" + isReponseMatching);
        assertTrue(isReponseMatching, "Positive Test Case");
    }

    public Optional<Upo> getUPO(String directoryPath, String fileName) {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try (InputStream is = classloader.getResourceAsStream(directoryPath + fileName);) {
            Upo upo = new ObjectMapper().readValue(is, Upo.class);
            return Optional.of(upo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
}
