package com.tnsif.day14.synchronization;

public class Account {
	private int accNo;
	private String name;
	private double balance;

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", Name=" + name + ", balance=" + balance + "]";
	}

	public Account() {
		super();

	}

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public synchronized void deposit(int amt) throws Exception {
		if (amt > 25000)
			throw new Exception("Daily limit exceeds...");
		else {
			balance += amt;
			System.out.println("Amount Deposited...." + amt);
		}

	}

	/* Non-synchronized method
	 * 
	 * @Override public void withdraw(int amt) { balance=balance-amt;
	 * System.out.println("Balance : "+balance); }
	 */

	// Synchronized method

	public synchronized void withdraw(int amt) throws Exception {

		if (balance - amt < balance)
			throw new Exception();
		else {
			balance = balance - amt;
			System.out.println("after withdrwing Rs." + amt + " current Balance : Rs." + balance);
		}
	}

}

