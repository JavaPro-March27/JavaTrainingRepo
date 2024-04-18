package com.learning.day4;

public class Account {
	
	private String name;
	private int accountNumber;
	private double balance;
	private int loan;
	private int fd;
	
	
	public Account( String name, int accountNumber, double balance) {
		this.name= name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	public void setName( String name) {
		 this.name= name;
	}
	
	public String getName() {
		return name;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public int getLoan() {
		return loan;
	}


	public void setLoan(int loan) {
		this.loan = loan;
	}


	public int getFd() {
		return fd;
	}


	public void setFd(int fd) {
		this.fd = fd;
	}
	

}
