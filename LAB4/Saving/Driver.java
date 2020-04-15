/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 1
 * 2/27/2019
 * 2/27/2019
 */
package Saving;
import java.util.Scanner;
import java.util.*;

public class Driver {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		SavingAccount saver1 = new SavingAccount(2000.00); // declaring and initializing saver 1 instace
		SavingAccount saver2 = new SavingAccount(3000.00); // declaring and initializing saver 2 instace
		SavingAccount.modifyInterestRate(4.0); // interest rate as 4.0%

		saver1.calculateMonthlyInterest();// calculation for saver 1 with 4% interest rate
		saver2.calculateMonthlyInterest();// calculation for saver 2 with 4% interest rate

		System.out.printf("Balance of accounts at at 4 percent interest rate: ");
		System.out.printf("\n\nBalance for Saver 1 is ");
		saver1.printData();
		System.out.printf("\nBalance for Saver 2 is ");
		saver2.printData();

		

		saver1.calculateMonthlyInterest();// calculation for saver 1 with 5% interest
		saver2.calculateMonthlyInterest();// calculation for saver 2 with 5% interest

		SavingAccount.modifyInterestRate(5.0); // interest rate as 5.0%
		System.out.printf("\n\n");
		System.out.printf("Balance of accounts at 5 percent interes rate:\n\n");
		System.out.printf("Balance for Saver 1 is ");
		saver1.printData();
		System.out.printf("\nBalance for Saver 2 is ");
		saver2.printData();
	}

}

/* TEST RUN
 * 
 * Balance of accounts at at 4 percent interest rate: 

Balance for Saver 1 is $2006.67
Balance for Saver 2 is $3010.00

Balance of accounts at 5 percent interest rate:

Balance for Saver 1 is $2013.36
Balance for Saver 2 is $3020.03

*/


