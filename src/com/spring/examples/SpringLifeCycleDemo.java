package com.spring.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeCycleDemo {
	
	public static void main(String[] args) {
		//load the spring configuration file
		
	       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanlifecycle.xml");
			
			//Retrieve the bean from spring container
	       RupeeCurrency currency=(RupeeCurrency)context.getBean("rupeeCurrency");
			
			//close the context
			 context.close();
			
			
	}

}
