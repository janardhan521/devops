package com.devops.prac.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second")
public class SecondController 
{
 @GetMapping("/msg")
  public String displayMsg()
  {
	  return "this second controller message";
  }
}
