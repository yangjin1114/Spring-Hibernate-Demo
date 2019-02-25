package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 6k";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
