package com.spring.examples;

public class MainApp {
	
	public static void main(String[] args) {
		Car car=new FordCar();
		String name=car.getName();
		System.out.println("Car Name="+name);
	}

}
