package com.wf.stp.rbms;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wf.stp.rbms.dto.upo.Upo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@DisplayName("STP Integration tests")
class RuleBasedMessageSanitizerApplicationTests {

	WebTestClient webTestClient;

	@Autowired
	private MockMvc mvc;

	//@BeforeAll
	void setup(){

	}

	//@BeforeEach
	void setUp() {
		// connect Web Client to Spring Boot application
		String port = "8080";//System.getProperty("test.server.port");
		webTestClient = WebTestClient.bindToServer().baseUrl("http://localhost:" + port)
				.responseTimeout(Duration.ofSeconds(15))
				.build();
	}

	@Test
	@DisplayName("Check if transaction ID is 2022021600000014")
	void Positive_CheckTransactionID() throws Exception {

		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		String upo = new String(classloader.getResourceAsStream("scenarios/positive/input/testcase1.json").readAllBytes());

		String addURI = "http://localhost:8080/api/v1/applyRules";
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", "application/json");
		headers.add("Content-Type", "application/json");
		HttpEntity<String> entity = new HttpEntity<String>(upo, headers);

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response =restTemplate.postForEntity(addURI, entity, String.class);

		Assert.isTrue(response.getStatusCode().is2xxSuccessful(),"Correct status code returned");
		Upo upoResponse = new ObjectMapper().readValue(response.getBody(),Upo.class);
		Assert.isTrue(upoResponse.getPmtInf().getComWellsfargoEpdUpoAvroPmtInf().getPmtId().getComWellsfargoEpdUpoAvroPmtId().getTxId().getString().equalsIgnoreCase("2022021600000014"),"The transaction id is correct.");
	}

	public static String readFileAsString(String file)throws Exception
	{
		return new String(Files.readAllBytes(Paths.get(file)));
	}

}
