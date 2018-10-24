package OOP;

public class BankAccount {
	private double balance;
	private int accountNumber;
	private double intrestRate;

	public BankAccount() {
		balance = -999;
		accountNumber = -999;
		intrestRate = -999;
	}

	public BankAccount(double xBalance, int xAccountNumber, double xIntrestRate) {
		balance = xBalance;
		accountNumber = xAccountNumber;
		intrestRate = xIntrestRate;
	}
	
	//accessor methods
	
	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getIntrestRate() {
		return intrestRate;
	}

	//mutator methods
	//setters
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public void setAccountNumber(int newAccountNumber) {
		accountNumber= newAccountNumber;
}
	public void setIntrestRate(double newIntrestRate) {
		intrestRate= newIntrestRate;
	}
	
	public void deposit(double deposited) {
		balance=balance+deposited;
	}
	...
}
