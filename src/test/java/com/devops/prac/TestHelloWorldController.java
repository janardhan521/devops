package com.devops.prac;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.devops.prac.controllers.HelloWorldController;

@WebMvcTest(HelloWorldController.class)
public class TestHelloWorldController 
{
	@Autowired
	private MockMvc mvc;

	@Test
	public void getAllEmployeesAPI() throws Exception 
	{
	  mvc.perform(MockMvcRequestBuilders.get("/springboot/welcome")
		      .accept(MediaType.TEXT_PLAIN_VALUE))
	  .andExpect(status().isOk())
	  .andExpect(MockMvcResultMatchers.content().string("Welcome to the spring boot demo using devops"));	  
	}
}
