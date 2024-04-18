package com.learning.day3;

public class Car {
	
//  Car  > has Attributes -> 	name, color, model, mfgYear, mileage
//       > has Methods    ->    drive(), stop()
	
	String name;
	String color;
    String model;
	int mfgYear;
	double mileage;
	static int noOfWheels =4;
	
	
	public void drive() {
		System.out.println("Car is driving");
	}
	
	public void stop() {
		System.out.println("Car has been stoped");
	}
	
	
     static void start() {
		
	}
	
	
	

}
