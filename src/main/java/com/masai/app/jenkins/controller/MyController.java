package com.masai.app.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/byebye")
	public String byebye() {
		return "ByeBye";
	}
}
