package com.citibank.springboot.tutorial.controller;

import org.apache.catalina.connector.Request;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
 
	@GetMapping("/")
	public String helloWorld(){
		return "Welcome to daily code buffer!!";
	}
}
