package com.naldojesse.bankaccountsim;


import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

//● Users should not be able to set any of the attributes from the class.
public class BankAccount {
	private String accountNum;
	private BigDecimal checkingsBal;
	private BigDecimal savingsBal;
	private static int numAccounts = 0;
	private static BigDecimal totalAllAccounts = new BigDecimal(0);
	
	public static String digits = "0123456789";
	
	//will take a double and convert and round to BigDecimal
	private BigDecimal currConverter(double amount) {
		return new BigDecimal(amount).setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
	
	//● Create a private method that returns a random ten digit account number.
	private void acctGen() {
		String str = "";
		for (int i = 0; i < 10; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
			str += randomNum;
		}
		System.out.println("New acct number: " + str);
		accountNum = str;
		
	}
	
	public static BigDecimal getAllAccountsTotal() {
		return totalAllAccounts;
	}
	
	//● In the constructor, be sure to increment the account count
	BankAccount() {
		acctGen();
		numAccounts++;
		
		checkingsBal = new BigDecimal(0);
		savingsBal = new BigDecimal(0);
	}
	
	//● Create a getter method for the user's checking account balance.
	public String getCheckingsBal() {
		return "$" + checkingsBal;
	}
	
	//● Create a getter method for the user's saving account balance
	public String getSavingsBal() {
		return "$" + savingsBal;
	}
	
	//● Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored
	public void deposit(String str, double amount) {
		BigDecimal cAmount = currConverter(amount);
		if (str == "savings") {
			//BigDecimal is immutable so you need to assign to local var and replace it
			savingsBal = savingsBal.add(cAmount);
		} else {
			checkingsBal = checkingsBal.add(cAmount);
		}
		totalAllAccounts = totalAllAccounts.add(cAmount);
		
	}
	
	//● Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	public String withdraw(String str, double amount) {
		BigDecimal cAmount = currConverter(amount);
		if(str == "savings") {
//			 a.compareTo(b) returns a number greater than zero if a > b, 0 if a == b, and less than zero if a < b.
			int cresult = savingsBal.compareTo(cAmount);
			if (cresult < 0) {
				return "Insufficient Funds!";
			} else {
				savingsBal = savingsBal.subtract(cAmount);
				totalAllAccounts = totalAllAccounts.subtract(cAmount);
				return "Withdraw is complete, your total savings balance is now $" + savingsBal;
			}
		} else {
			int cresult = checkingsBal.compareTo(cAmount);
			if (cresult < 0) {
				return "Insufficient Funds";
			} else {
				checkingsBal = checkingsBal.subtract(cAmount);
				totalAllAccounts = totalAllAccounts.subtract(cAmount);
				return "Withdraw is complete, your total checkings balance is now $" + checkingsBal;
				
			}
		}
		
	}
	
	//● Create a method to see the total money from the checking and saving.
	public String getTotalBalance() {
		BigDecimal totalBalance = savingsBal.add(checkingsBal);
		return "Your total balance is : $" + totalBalance;
	}
	
	
	
}
