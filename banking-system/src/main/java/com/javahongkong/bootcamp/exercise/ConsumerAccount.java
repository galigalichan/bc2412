package com.javahongkong.bootcamp.exercise;

public class ConsumerAccount extends Account {
	Person person;
	double currentBalance;

	public ConsumerAccount(Person person, Long accountNumber, int pin, double currentBalance) {
		// complete the function
		super(person, accountNumber, pin);
		this.currentBalance = currentBalance;
	}

}