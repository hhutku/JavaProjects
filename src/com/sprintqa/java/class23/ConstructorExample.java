package com.sprintqa.java.class23;

class HSBCAccount {

	int balance;
	int accountNumber;
	String accountName;

	// Default constructor
	public HSBCAccount() {
		balance = 1000;
		accountName = "xyz";
		accountNumber = 1;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}

}

public class ConstructorExample {
	public static void main(String[] args) {
		HSBCAccount account1 = new HSBCAccount();
		HSBCAccount account2 = new HSBCAccount();
		HSBCAccount account3 = new HSBCAccount();
		HSBCAccount account4 = new HSBCAccount();
		
		
		
	}
}
