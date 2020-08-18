package com.maljlk.demoapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//Inject Property for coach.name
	@Value("${coach.name}")
	private String coachName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkOut() {
		return "Daily Work Out";
	}
	
	@GetMapping("/coachName")
	public String getCoachName() {
		return "Coach:"+coachName;
	}


}
