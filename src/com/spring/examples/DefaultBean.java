package com.spring.examples;

import org.springframework.stereotype.Component;

@Component
public class DefaultBean {
	
	public DefaultBean() {
	  System.out.println("Welcome to DefaultBean demo");
	}
	
	public void getDetails() {
		System.out.println("Call this method without bean id ");
	}

}
