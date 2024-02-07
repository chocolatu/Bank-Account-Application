/*
 * Duy Duong Le (Harry)
 * Email: duonglevancouver@gmail.com
 * Linkedin: linkedin.com/in/duy-duong-le-274612184/
 * Github: github.com/duyduongle
 * Date of Completion: February 07, 2024
 * */
package bankaccountapp;

public class Checking extends Account {
	
	// List properties specific to checking account: debit card, PIN, 11-degit account for checking account
	//debitCardNumber, PIN
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	// override
	public void setRate() {
		rate = getBaseRate() * 0.13;
	}
	
	// set debit card method
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPIN = (int) (Math.random() * Math.pow(10, 4));
	}
	
	//List any methods specific to the checking account
	public void showInfo() {
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println(
				" Your checking account features: " +
		        "\n Debit Card Number: " + debitCardNumber +
		        "\n Debit Card PIN: " + debitCardPIN);
		
	}

}
