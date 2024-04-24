package com.learning.day9;

public class ATM {
	
	
	public void withdraw(int amount) throws MinBalanceException {
		
		  if(amount <100) {
			  throw new MinBalanceException("Please select min 100 $");
		  }
	}

}
