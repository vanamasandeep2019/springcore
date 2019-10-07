package com.spring.examples;

import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("Welcome to annotations world");
	}
	
	

}
