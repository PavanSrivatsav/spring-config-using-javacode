package com.spring.learning.conf.with.javacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfWithJavaCode {

	@Bean
	public FortuneService happyServiceBean() { // creating a bean as ref of
												// Fortune Service and
												// assigning
												// HappyFortuneService IMP =>
												// getFortuneService is BeanID
		return new HappyFortuneService();
	}

	@Bean
	public Coach formulaOneCoachBean() { // performing DI for the
											// formula one coach IMP =>
											// getFormulaOneCoach is BeanID
		return new FormulaOneCoach(happyServiceBean());
	}

}
