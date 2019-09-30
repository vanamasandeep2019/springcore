package com.spring.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {
	
	
	public static void main(String[] args) {
		
		//Load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Retrieve the bean from spring container
		Car car=context.getBean("fordCar",Car.class);
		
		
		//call methods on the bean
		System.out.println(car.getName());
		
		//close the context
		 context.close();
		
	}

}
