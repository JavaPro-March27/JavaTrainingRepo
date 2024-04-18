package com.learning.day3;

public class BankAccount {
	
	private int accountNumber;
	public String accountHolderName;
	public static int routingNumber;
	private double balance;
	public String accountType;
	
	private int SNN;
	private int pin;
	private String password;
	private String userName;
	protected double loanApr=5.6;
	       
	
	
	public void chnagePassword(String updatedPassword) {
		password = updatedPassword;
	}
	
	public String getPassword() {
		return 	password;
	}

}
