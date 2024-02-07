/*
 * Duy Duong Le (Harry)
 * Email: duonglevancouver@gmail.com
 * Linkedin: linkedin.com/in/duy-duong-le-274612184/
 * Github: github.com/duyduongle
 * Date of Completion: February 07, 2024
 * */
package bankaccountapp;

public interface IBaseRate {
	
	// Write a method that return the base rate
	// In the real world situation, the banking system will decide the base rate and this function is to get the base rate from the system
	// Here, to make it simple, we decide the base rate is 2.5
	default double getBaseRate() {
		return 2.5;
	}

}
