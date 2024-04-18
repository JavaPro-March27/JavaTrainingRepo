package com.learning.day4;

public class Phone {
	
	String color;
	String model; 
	String os;
	int mfgYear;
	
	// default constructor is alredy here.
    public Phone() {
   	 
    }
    
    //  parameterized constructor
    public Phone(String inputOs) {
   	 os =inputOs;
    }
	
    

	//  parameterized constructor
	public Phone(String color,String model,String os,  int mfgYear ) {
		
		this.color=color;
		this.model=model;
		this.os=os;
		this.mfgYear =mfgYear;	
	}
	
	
	public void callAll() {
		calculateApr();
		calculateNoOfLoan();
		calculateCreditScore();
		makeAFinalOutput();
	}
	
	public static void calculateApr() {
		System.out.println("This is calculateApr 1");
	}
	
	
	private void calculateNoOfLoan() {
		System.out.println("this is calculateNoOfLoan 2");
		calculateCreditScore();
	
		
	}
	
	private void calculateCreditScore() {
		System.out.println("This is calculateCreditScore 3");
		
	}
	
	
	private void makeAFinalOutput() {
		System.out.println("This is makeAFinalOutput 4");
	}
}
