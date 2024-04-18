package com.learning.day3;

public class Bank {

	public static void main(String[] args) {
	
		
		
		 BankAccount account1 = new BankAccount();
	System.out.println(	  account1.getPassword());
	
	  account1.chnagePassword("123456");
		 
	  System.out.println(	  account1.getPassword()); 
	  
	  account1.chnagePassword("rdtfhbj");
	  
	  System.out.println(	  account1.getPassword()); 
	}

}
