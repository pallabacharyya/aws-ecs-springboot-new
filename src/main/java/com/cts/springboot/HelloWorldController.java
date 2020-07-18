package com.cts.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/home")
	public String homeApi() {
		
		String fargateStr= "Welcome to AWS ECS Fargate Demo !!!";
			
		return fargateStr;
	}

}
