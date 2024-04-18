package com.learning.day4;

public class Bank {
	
  private Account[] accounts = new Account[10];
  private int position =0;	
  private int noOFLoans=0;
  private int noOFFds=0;
  
  public void addAccount(Account inputAccount) {
	 if(position < accounts.length) {
		 accounts[position] = inputAccount;
		  position++; 
	 }else {
		 System.out.println("Bank is full with accounts");
	 }
  }
  
  
  public Account getAccountByPosition(int inputPosition) {
	  
	  return accounts[inputPosition];
	  
  }
  
  public int totalFixedDeposits() {
	  return noOFFds;
  }
  
  
  public int totalLoans() {
	  return noOFLoans;
  }
  
  public int totalAccounts() {
	  return position;
  }
  
  public void printAllAccounts() {
	  
	  for( int i=0; i< position; i++) {
	     System.out.println(accounts[i].getName() + " "+accounts[i].getAccountNumber()+ " "+ accounts[i].getBalance() );
	  }
  }
  
  
  public void issueALoanTOUser(int inputPosition, int loanAmmount) {
	  Account userAccount = accounts[inputPosition];
	  userAccount.setLoan(loanAmmount);
	  noOFLoans++;
  }
	
  
  public void fdWithBankbyUser(int inputPosition, int fDAmount) {
	  Account userAccount = accounts[inputPosition];
	  userAccount.setFd(fDAmount);
	  noOFFds++;
  }

}
