package com.spring.learning.conf.with.javacode;

import org.springframework.beans.factory.annotation.Value;

public class FormulaOneCoach implements Coach {

	@Value("${coachCountry}")
	private String country;

	public String getCountry() {
		return country;
	}

	public FormulaOneCoach() {
	}

	private FortuneService fortuneService;

	public FormulaOneCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "try reaching top speed in your vehicle";
	}

	@Override
	public String getDailyFortune() {
		return "formula one : " + fortuneService.getFortune();
	}

}
