package com.spring.learning.conf.with.javacode;

import org.springframework.stereotype.Component;

@Component
public class FormulaOneCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "try reaching top speed in your vehicle";
	}

}
