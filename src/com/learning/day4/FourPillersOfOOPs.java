package com.learning.day4;

public class FourPillersOfOOPs {

	public static void main(String[] args) {
	
		
//		1. Encapsulation
//		2. Inheritance
//		3. Polymorphism
//		4. Abstraction
		
		
//		1. Encapsulation
		
//		Encapsulation is to make sure that "sensitive" data is hidden from the users.
//		1. declear class variables / attributes as private.
//		2. we will create a set or get methods to acces or update the values of variables / attributes.
		
		Health myHealth = new Health();
		
		System.out.println(myHealth.getAge());
		
		myHealth.setAge(35);
		
		System.out.println(myHealth.getAge());
		
		

	}

}
