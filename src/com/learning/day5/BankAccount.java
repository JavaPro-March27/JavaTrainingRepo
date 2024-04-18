package com.learning.day5;

public abstract class BankAccount {
	
    int accountNumber = 123;
	int routingNumber; 
	String name;
	

	public void showBestIntrestRates(int snn, double salary, String housingtype) {
		calculatecreditScore();
		calculateNoOfLoans();
		creditLength();
		otherFactors();
	}
	
	
	
	private void calculatecreditScore(){
		//logic
	}
	
	private void calculateNoOfLoans(){
		//logic
	}
	
	
	private void creditLength(){
		//logic
	}
	
	private void otherFactors(){
		//logic
	}
	
}
