package com.naldojesse.bankaccountsim;

//Create a BankAccount class.
//● The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
//● Create a class member (static) that has the number of accounts created thus far.
//● Create a class member (static) that tracks the total amount of money stored in every account created.
//● In the constructor, call the private method from above so that each user has a random ten digit account.

//import java.math.BigDecimal;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount a = new BankAccount();
		
		a.deposit("savings", 10);
		a.deposit("checkings", 9999.90);
		
		System.out.println(a.getCheckingsBal());
		System.out.println(a.getSavingsBal());
		
		System.out.println(BankAccount.getAllAccountsTotal()); 
		
		System.out.println(a.withdraw("savings", 5938.10388));
		System.out.println(a.withdraw("checkings", 5));
		
		System.out.println(a.getTotalBalance());
		
	}
}
