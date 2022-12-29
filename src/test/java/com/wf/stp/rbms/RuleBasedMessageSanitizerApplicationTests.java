package com.wf.stp.rbms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wf.stp.rbms.dto.upo.Upo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@DisplayName("STP Integration tests")
@Slf4j
class RuleBasedMessageSanitizerApplicationTests {

    private static final Path POSITIVE_TESTCASE_DIR = Path.of("src\\test\\resources\\scenarios\\positive\\input");
    private static final Path NEGATIVE_TESTCASE_DIR = Path.of("src\\test\\resources\\scenarios\\negative\\input");

    @Autowired
    private MockMvc mvc;

    public static String readFileAsString(String file) throws Exception {
        return new String(Files.readAllBytes(Paths.get(file)));
    }

    @Test
    @DisplayName("Positive test cases")
    void Positive_CheckTransactionID() throws Exception, JsonProcessingException {
        Files.walk(POSITIVE_TESTCASE_DIR).forEach(path -> {
            if (!path.toFile().isDirectory()) {
                String fileName = path.getFileName().toString();
                log.info("Filename:" + fileName);
                Upo inputUpo = getUPO("scenarios/positive/input/", fileName).get();
                log.info("i/p upo:" + inputUpo);
                Upo response = null;
                try {
                    response = readAPIRepsonse(new ObjectMapper().writeValueAsString(inputUpo)).get();
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                Upo expectedUpo = getUPO("scenarios/positive/expected_op/", fileName).get();
                boolean isReponseMatching = false;
                try {
                    String strExpected = new ObjectMapper().writeValueAsString(expectedUpo);
                    String strResponse = new ObjectMapper().writeValueAsString(response);
                    isReponseMatching = strExpected.equalsIgnoreCase(strResponse);
                    saveFileToDisk("scenarios/positive/input/", fileName, strResponse);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
                log.info("Test case for scenarios/positive/input/" + fileName + " passed:" + isReponseMatching);
                Assert.isTrue(isReponseMatching, "Positive Test Case");
            }
        });
    }

    public Optional<Upo> readAPIRepsonse(String upo) {
        try {
            String addURI = "http://localhost:8090/api/v1/applyRules";
            HttpHeaders headers = new HttpHeaders();
            headers.add("Accept", "application/json");
            headers.add("Content-Type", "application/json");
            HttpEntity<String> entity = new HttpEntity<String>(upo, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<String> response = restTemplate.postForEntity(addURI, entity, String.class);
            return Optional.of(new ObjectMapper().readValue(response.getBody(), Upo.class));
        } catch (Exception je) {
            //log.error("Unable to map the response to Upo object:"+je.getOriginalMessage());
            return Optional.empty();
        }
    }

    public boolean saveFileToDisk(String directoryPath, String fileName, String responseUpo) {
        ClassLoader classLoader = getClass().getClassLoader();
        String absolutePathWithName = classLoader.getResource(directoryPath + fileName).getPath().replaceAll("input", "expected_op");
        log.info("OP File Path:" + absolutePathWithName);
        try (FileWriter file = new FileWriter(absolutePathWithName)) {
            file.write(responseUpo);
            file.flush();
        } catch (IOException e) {
            log.error("Unable to write file to disk: " + e.fillInStackTrace());
        }
        return true;
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
