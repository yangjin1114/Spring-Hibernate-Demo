package com.luv2code.springdemo;

import java.util.Random;

public class SupriseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		String[] fortunes = {"Surprise!", "A person is never too old to learn.",
				"All your hard work will soon pay off." };
		
		Random random = new Random();
		
		return fortunes[random.nextInt(3)];
	}

}
