/*
 * Duy Duong Le (Harry)
 * Email: duonglevancouver@gmail.com
 * Linkedin: linkedin.com/in/duy-duong-le-274612184/
 * Github: github.com/duyduongle
 * Date of Completion: February 07, 2024
 * */
package bankaccountapp;

public class Savings extends Account {
	
	// List properties to specific to the Savings account
	//savingsAccountNumber, safetyBox, 3_digitNumber, 4_digitCode
	private int safetyDepositBoxID;
	private int safetyDepositKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		
	}
	
	
	public void setRate() {
		rate = getBaseRate() - 0.25;
	}
	
	// setSafetyDepositBox()
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositKey = (int) (Math.random() * Math.pow(10, 4));
	}
	
	// List any methods specific to savings account
	public void showInfo() {
		System.out.println("Account Type: Savings");
		super.showInfo();
		System.out.println(
				" Your savings account features: " + 
		        "\n Safety Deposit Box ID: " + safetyDepositBoxID + 
		        "\n Safety Deposit Box Key: " + safetyDepositKey);
	}
	
	

}
