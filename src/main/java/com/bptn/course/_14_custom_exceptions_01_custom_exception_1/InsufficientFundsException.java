package com.bptn.course._14_custom_exceptions_01_custom_exception_1;

public class InsufficientFundsException extends Exception {
	

	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

		

}