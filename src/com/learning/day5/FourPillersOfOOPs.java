package com.learning.day5;

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
		
		
//		2. Inheritance
		
//		its possible to inherit attributes and methods from one  class to another class.
//		1. subclass or child class -> class that inherits from [another class]<-(This will be the parent class or "super class" for this child or sub class).
//		2. super class or parent class -> -------------------------------------------
		
		
		// "super" keyword is used to access the parent methods or attributes.
		
		// To inherit from one class to another class, we will use a keyword called "extends".
		
		// For all the objects in java, parent class is Object class. 
		
		
		// 1. Single Inheritance      A -> B
//		                              A -> C
		// 2. Multi-level Inheritance    A -> B -> C
		// 3. Multiple Inheritance     Father  A  \ -> C
//		                               Mother  B  / -> C
//		Java Classes does not support Multiple Inheritance
		
//		   4. Hierarchical Inheritance
//		   5. Hybrid Inheritance  ->  not supported
		
		
		// Bank Account -> accountNumber, routingNumber, name
		// Checkings Account -> rate, minBalance, maxLimit
		// Savings Account   -> noOfTansectionsLimit;
		
		//  GrandParent       Parent               Child
		// Bank Account -> Checkings Account -> Savings Account
		
		//  Bank Account ->   Checkings Account 
		//  Bank Account ->   Savings Account
		
		
//		3. Polymorphism => Many forms.
		
//		Poly     -> Many
//		morphism  -> forms
		
		
//		1. Compile time Polymorphism  => Method overloading
//		2. Run time Polymorphism   => method overriding
		
//		1. Method Overloading
//		    method name -> same
//		    different number of parameters with same datatype
//		    different datatypes with same number of parameters
//		    within the same class.
		
		
//		2. Method Overriding
//		@Override 
//		 Method Overriding will be used when there are two classes haiving a Inheritance relationship 
//		 and both are having same method with different implementation.
		
		
		
		
//		4. Abstraction 
//		Abstraction is a process of hiding the certain details and showing only essentional information to the user.
//		Abstraction -> hiding the implementation.
		
//		 1. By using abstact classes 
//		 2. Interfaces.
//		 3. Private methods
		
//		-> what is abstract class ? 
//		-> we will use keyword "abstract".
// 		-> we can not create the object by using abstract class.
//		-> Abstract methods can only be used in side a abstarct class  -> abstract methods will not have a body.
//		-> Abstract Classes can have both regular methods and Abstract methods.
//		-> whatever class that is extending from abstract class needs o provide the implementation for abstract methods.
		
		
//       what is Interface ? 
//		 this is another way to achive abstraction.
//		 An interface is a completely abstract class, only abstract methods are allowed.
//		 to access the interface methods, the interface must be implementated  by another class, 
//		 we use a keyword "implements".

//		rules
//		interfaces can not be used to create objects.
//		interfaces we will be having abstract methods only.
//		when any classs impementating an interface, that class must provide the implementation for all its methods;
//		In interfaces -> methods-> by default -> public, attributes are -> static and final. 
//		an interface can not contain a constructor.
		
		
//		=> by suing interfaces we can implement the Multiple Inheritance.
		
		
		// public interface Name{
	//   
		
	//      }
		
		
		
		
	      String s = new String("Maru");

		
		

	}

}
