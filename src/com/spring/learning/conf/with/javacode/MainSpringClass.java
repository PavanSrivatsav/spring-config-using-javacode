package com.spring.learning.conf.with.javacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FormulaOneCoach.class);

		Coach c = context.getBean("formulaOneCoach", Coach.class);
		System.out.println(c.getDailyWorkout());
		context.close();

	}

}
