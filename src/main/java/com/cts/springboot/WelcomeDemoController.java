package com.cts.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeDemoController {
	
	@GetMapping("/home")
	public String homeApi() {
		
		System.out.println("Inside home API");
		String fargateStr= "!!!  Welcome to AWS ECS Fargate Demo  !!!";
			
		return fargateStr;
	}

}
