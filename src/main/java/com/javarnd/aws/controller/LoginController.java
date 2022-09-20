package com.javarnd.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/aws/loginUser")
	public String helloUser() {
		
		return "Hello User";
	}
}
