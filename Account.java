/*
 * Duy Duong Le (Harry)
 * Email: duonglevancouver@gmail.com
 * Linkedin: linkedin.com/in/duy-duong-le-274612184/
 * Github: github.com/duyduongle
 * Date of Completion: February 07, 2024
 * */
package bankaccountapp;

public abstract class Account implements IBaseRate{
	// List common properties for savings and checking accounts
	// name, SSN, accountType, deposit, rate
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	protected double rate;
	private static int index = 10000;
	
	
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		this.balance = initDeposit;
		
		// Set account number
		this.accountNumber = setAccountNumber();
		setRate();
	}
	
	// set the rate
	public abstract void setRate();
	
	
	// Set account number
	private String setAccountNumber() {
		index++;
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
		
	}
	
	// compound()
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance += accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
	}
	
	//List common methods - transaction methods
	//deposit()
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposit $" + amount);
	}
	
	//withdraw()
	public void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw $" + amount);
	}
	
	//transfer()
	public void transfer(String toWhere, double amount) {
		balance -= amount;
		System.out.println("Transfer $" + amount + " to" + toWhere);
	}
	
	public void printBalance() {
		System.out.println("Your balance is: $" + balance);
	}
	
	//showInfo()
	public void showInfo() {
		System.out.println("Name: " + name
				+ "\nAccount Number: " + accountNumber  
				+ "\nBalance: " + balance + 
				"\nRate: " + rate + "%");
	}
	
	

}
