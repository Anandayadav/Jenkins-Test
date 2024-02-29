package com.Jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

	@GetMapping("/greet")
	public String greetMsg()
	{
		return "Good Morning, Welcome To AshokIT"; 
	}
}
