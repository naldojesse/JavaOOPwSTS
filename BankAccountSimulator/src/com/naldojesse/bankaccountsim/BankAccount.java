package com.naldojesse.bankaccountsim;


import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {
	private String accountNum;
	private BigDecimal checkingsBal;
	private BigDecimal savingsBal;
	private static int numAccounts = 0;
	private static BigDecimal totalAllAccounts = null;
	
	public static String digits = "0123456789";
	
	private void acctGen() {
		String str = "";
		for (int i = 0; i < 10; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
//			
			str += randomNum;
		}
		System.out.println("New acct number: " + str);
		accountNum = str;
		
	}
	
	BankAccount() {
		acctGen();
		numAccounts++;
		
		checkingsBal = new BigDecimal(0);
		savingsBal = new BigDecimal(0);
	}
	
	public BigDecimal getCheckingsBal() {
		return checkingsBal;
	}
	
	public BigDecimal getSavingsBal() {
		return savingsBal;
	}
	
	public void deposit(String str, double amount) {
		BigDecimal converted = new BigDecimal(amount).setScale(2,  BigDecimal.ROUND_HALF_EVEN);
		if (str == "savings") {
			//BigDecimal is immutable so you need to assign to local var and replace it
			BigDecimal result = savingsBal.add(converted);
			savingsBal = result;
//			System.out.println("Savings");
//			System.out.println(savingsBal);
		} else {
			BigDecimal result = checkingsBal.add(converted);
			checkingsBal = result;
			
//			System.out.println("Checkings");
//			System.out.println(checkingsBal);
		}
		
	}
	
	
	
}
