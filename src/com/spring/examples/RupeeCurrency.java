package com.spring.examples;

public class RupeeCurrency{
	
	public RupeeCurrency() {
		
	}

	public RupeeCurrency(String type,Integer value) {
		System.out.println(type+ " "+value);
	}
	
	public void myInit() {
		System.out.println("Iam in my init method");
	}
	
	public void myDestroy() {
		System.out.println("Iam in my destroy method");
	}
	

}
