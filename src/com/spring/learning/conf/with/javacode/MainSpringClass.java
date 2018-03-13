package com.spring.learning.conf.with.javacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				SpringConfWithJavaCode.class);

		Coach c = context.getBean("formulaOneCoachBean", Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());

		FormulaOneCoach f = context.getBean("formulaOneCoachBean", FormulaOneCoach.class);
		System.out.println(f.getCountry());
		context.close();
	}

}
