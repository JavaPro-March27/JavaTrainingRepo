package com.learning.day4;

public class WorkSpace {

	public static void main(String[] args) {
		
	 Bank bofa = new Bank();
	 
	 System.out.println(bofa.totalLoans());
	 
	 System.out.println(bofa.totalAccounts());
	 
	 Account account1 = new Account("roy", 12345, 500);
	 
	 bofa.addAccount(account1);
	 
	 Account account2 = new Account("kim", 8765, 230);
	 
	 bofa.addAccount(account2);
	 
	 System.out.println(bofa.totalAccounts());
	 
	 bofa.printAllAccounts();
	  
	 bofa.issueALoanTOUser(1, 1000);
	  
	  
	 System.out.println(bofa.totalLoans());
	 
	 
	}

}
