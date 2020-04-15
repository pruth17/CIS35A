/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 1
 * 2/27/2019
 * 2/27/2019
 */

package Saving;
public class SavingAccount {
	// instance variabales

	private static double annualInterestRate = 0.0f;
	private double savingsBalance = 0.0;
	private double monthlyInterest = 0.0;
	
	// getters and setters

	protected double getMonthlyInterest() {
		return monthlyInterest;
	}


	protected void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}
	
	public SavingAccount() {
		// constructor
		this.savingsBalance = 0.0;
	}


	public SavingAccount(double amount) {
		// constructor with parameters
		this.savingsBalance = amount;
	}

	// getters and setters
	protected static void setAnnualInterestRate(double annualInterestRate) {
		SavingAccount.annualInterestRate = annualInterestRate;
	}


	protected void setSavingsBalance(double balance) {
		savingsBalance = balance;
	}

	protected double getAnnualInterestRate() {
		return (double) annualInterestRate;
	}

	protected double getSavingsBalance() {
		return (double) savingsBalance;
	}

	public void calculateMonthlyInterest() {
		// calculated Monthly Interest
		monthlyInterest = (this.savingsBalance * (annualInterestRate) / (1200));
		this.savingsBalance += monthlyInterest;
	}

	public static void modifyInterestRate(double changeAnnualInterestRate) {
		// modifies interest
		annualInterestRate = changeAnnualInterestRate;
	}

	public void printData() {
		System.out.printf("$%.2f", this.savingsBalance);
	}

	public void printData2() {
		System.out.printf("At Interest Rate of %.2f%%\nThe balance for the account is $%.2f\n\n", annualInterestRate,
				savingsBalance);
	}
	
	public static void deposit(SavingAccount input, double amount) {
		// deposists money
		input.setSavingsBalance(input.getSavingsBalance() + amount);
		if (input.getSavingsBalance() > 10000) {
			SavingAccount.modifyInterestRate(10);
		}
	}
	
	public static void withdraw(SavingAccount input, double amount) {
		// withdraws money

		if (input.getSavingsBalance() > amount) {
			input.setSavingsBalance(input.getSavingsBalance() - amount); 
		} 
		else if (input.getSavingsBalance() == amount) {
			input.setSavingsBalance(input.getSavingsBalance() - amount);
		} 
		else {
			System.out.printf("Balance Error");
		}
		if (input.getSavingsBalance() <= 10000) {
			SavingAccount.modifyInterestRate(4);
		}
	}
	
	
}
