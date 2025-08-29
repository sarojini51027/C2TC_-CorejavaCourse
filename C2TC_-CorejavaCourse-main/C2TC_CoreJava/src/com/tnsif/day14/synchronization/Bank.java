package com.tnsif.day14.synchronization;

import javax.naming.InsufficientResourcesException;

public class Bank {
	int MINBAL=5000; //fields are static and final
	static final int DAILY_LIMIT=25000;
	public void deposit(int amt) throws DepositLimitExceedsException {
	}
	void withdraw(int amt)throws InsufficientResourcesException {
	} //public and abstract
}

