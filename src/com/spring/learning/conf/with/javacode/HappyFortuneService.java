package com.spring.learning.conf.with.javacode;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune is high today !";
	}

}
