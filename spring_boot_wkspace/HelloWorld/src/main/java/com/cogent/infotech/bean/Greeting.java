package com.cogent.infotech.bean;

import org.springframework.stereotype.Component;

@Component
public class Greeting {

	public String hello() {
		
		return "Welcome to the spring boot world";
	}
}
