package com.cts.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeDemoController {
	
	@GetMapping("/home")
	public String homeApi() {
		
		System.out.println("Inside home API");
		String fargateStr= "!!!  Hi All : Welcome to AWS ECS Fargate Demo new !!!";
			
		return fargateStr;
	}

}
