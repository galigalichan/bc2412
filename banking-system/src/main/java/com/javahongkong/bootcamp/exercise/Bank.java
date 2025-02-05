package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		// complete the function
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return null;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		return new CommercialAccount(company, pin, startingDeposit);
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		return new ConsumerAccount(person, pin, startingDeposit);
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		if (accounts.getAccount() == getAccount(accountNumber) && Account. = )
		return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		return accountNumber.Account.getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		.getBalance() -= amount;
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return false;
	}
}
