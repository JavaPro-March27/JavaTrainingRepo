package com.learning.day4;

public class ConstructorsIntro {

	public static void main(String[] args) {
	
		// Special method that is used to initialise the objects
		// By default constructor method will be called when an object of a class is created.
		// it wil be used to set the initial values of the object's attributes 
		
		
//		rules :
//		1.  it has to use the Class name as same as constructorName
//		2.  no retrun type and no retrun statement.
//		3.  Almost we ill make it public.

		// default constructor 
		
//         public className(){
		
//	       }
		
		
		Phone phone0 = new Phone();
		phone0.color ="blue";
		phone0.mfgYear = 2024;
		phone0.model ="14 mini";
		phone0.os ="ios";
		
		
		
		
		Phone phone1 = new Phone("blue", "14 mini", "ios", 2024);
		Phone phone2 = new Phone("ios");
		
		Phone phone3 = new Phone();
		Phone phone4 = new Phone();
		Phone phone5 = new Phone();
		Phone phone6 = new Phone();
		
		
		System.out.println(phone0.color);
		System.out.println(phone3.color);
		
	      phone0.callAll();
	     
//      parameterized constructor 
		
//      public className(datatype varName){
		
//	    }

		
		
		
		// Keyword called "this"
		
		// this keyword refers to the current Object(itself) in a method or constructor.
		// -> this is used to eliminate the confusion between attributes and parameters with the same name.
		
		
		
	}

}
