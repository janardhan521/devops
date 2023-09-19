package com.devops.prac.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

	@GetMapping("/welcome")
	public String displayWelcomeMsg() {
		return "Welcome to the spring boot demo using devops";
	}
}
