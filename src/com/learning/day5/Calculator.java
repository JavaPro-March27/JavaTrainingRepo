package com.learning.day5;

public class Calculator {
	
	
	
	
	
	public void add() {
		
		System.out.println(10+20);
		
	}
	
	
   public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
   
   public void add(double a, double b) {
		
		System.out.println(a+b);
		
	}

   
   
   public void add(double a, double b, double c) {
		
		System.out.println(a+b+c);
		
	}
   
   public void add(int a, int b, double c) {
		
		System.out.println(a+b+c);
		
	}
   
    public double add(int a, double b, double c) {
		
		return a+b+c;
		
	}
    
//    @Override
//    public String toString() {
//    	
//    	return "This is a Calculator"; 
//    }

}
