package com.bae.JavaProgramBackend.property;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.bae.JavaProgramBackend.property.domain.Property;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@Sql(scripts= {"classpath:tableSchema.sql",
		"classpath:property-data.sql"},executionPhase=ExecutionPhase.BEFORE_TEST_METHOD)

public class backendControllerIntegrationTest {
	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void testCreate() throws Exception{
		Property testProperty =new Property("10 Kings road","0.1111,5.44","Ipswich",150000,2);
		String testPropertyAsJSON=this.mapper.writeValueAsString(testProperty);
		RequestBuilder req =post("/create").contentType(MediaType.APPLICATION_JSON).content(testPropertyAsJSON);
		
		Property testCreatedProperty=new Property(2,"10 Kings road","0.1111,5.44","Ipswich",150000,2);
		String testCreatedPropertyAsJSON=this.mapper.writeValueAsString(testCreatedProperty);
		ResultMatcher checkStatus=status().is(201);
		ResultMatcher checkBody=content().json(testCreatedPropertyAsJSON);
		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
	
	
	
	
}
