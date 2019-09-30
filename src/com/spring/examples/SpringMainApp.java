package com.spring.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {
	
	
	public static void main(String[] args) {
		
		//Load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//Retrieve the bean from spring container
		Car car=context.getBean("fordCar",Car.class);
		Car hyndaiCar=context.getBean("hyndaiCar",Car.class);
		
		RupeeCurrency currency=context.getBean("rupee",RupeeCurrency.class);
		
		//call methods on the bean
		System.out.println(car.getName());
		System.out.println(hyndaiCar.getName());
		
		//close the context
		 context.close();
		
	}

}
