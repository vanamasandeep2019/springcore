package com.spring.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotations.xml");
		
		// Though we didnot define bean id in default bean class spring will automatically creates beans for us
		
		DefaultBean defaultBean=context.getBean("defaultBean",DefaultBean.class);
		defaultBean.getDetails();
		
		
	}

}
