package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrackConfig {
	
	@Bean
	public Coach trackCoach() {
		return new TrackCoach(practiceFortuneService());
	}
	
	@Bean
	public FortuneService practiceFortuneService() {
		return new PracticeFortuneService();
	}

}
