package entities;

public class Holder {
	
	private int numberAccount;
	private String name;
	private double balance;
	
	public Holder(int numberAccount, String name, double balance) {
		this.numberAccount = numberAccount;
		this.name = name;
		this.balance = balance;
	}
	
	public Holder(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
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
			this.balance -= amount;
			return true;
		}
		return false;
	}

}
