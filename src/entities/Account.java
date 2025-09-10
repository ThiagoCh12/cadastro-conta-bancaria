package entities;

public class Account {
	
	private int numberAccount;
	private String name;
	private double balance;
	
	public Account(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public Account(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
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
	
	public boolean deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}
	
	public boolean withdraw(double amount) {
		if(amount > 0 && this.balance >= amount) {
			this.balance -= amount + 5;
			return true;
		}
		return false;
	}

}
