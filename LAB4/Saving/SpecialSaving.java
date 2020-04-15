/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 1
 * 2/27/2019
 * 2/27/2019
 */
package Saving;

class SpecialSavings extends SavingAccount {
	// this class is child class od SavingAccount class


	public SpecialSavings(double savingsBalance, double annualInterestRate) {
		// constructor
		super(savingsBalance);
	}

	public void calculateMonthlyInterest(SavingAccount input) {
		// calculates monthly interest rate
		if (input.getSavingsBalance() > 10000) {
			SavingAccount.modifyInterestRate(10.0);
			input.setMonthlyInterest(input.getSavingsBalance() * input.getAnnualInterestRate() / 1200);
		} else {
			super.calculateMonthlyInterest();
		}
	}

	

	
}
