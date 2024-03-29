package com.spring.examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	
	public static void main(String[] args) {
		
		//load the spring configuration file
		
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanscopes.xml");
		
		//Retrieve the bean from spring container
		Car fordCar=context.getBean("fordCar",Car.class);
		
		Car fordNewCar=context.getBean("fordCar",Car.class);
		
		
		Car hyndaiCar=context.getBean("hyndaiCar",Car.class);
		Car hyndaiCar1=context.getBean("hyndaiCar",Car.class);
		
		
		System.out.println(fordNewCar.hashCode());
		System.out.println(fordCar.hashCode());
		
		//Compare two objects are equal or not
		
		System.out.println("Singleton Example");
		
		System.out.println(fordCar==fordNewCar);
		
		System.out.println("Prototype Example");
		
		System.out.println(hyndaiCar==hyndaiCar1);
		
		//close the context
		 context.close();
		
		
		
	}

}
