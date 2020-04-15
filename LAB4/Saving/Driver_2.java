/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 4 PART 1
 * 2/27/2019
 * 2/27/2019
 */
package Saving;
public class Driver_2 {
	


		public static void main(String[] args) {
			SavingAccount saver1 = new SavingAccount(2000.00f);
			SavingAccount saver2 = new SavingAccount(3000.00f);
			SavingAccount.modifyInterestRate(4f);
			saver1.printData2();
			saver2.printData2();
			SpecialSavings.deposit(saver1, 1000.00f);
			saver1.printData2();
			SpecialSavings.deposit(saver2, 10000.00f);
			saver2.printData2();
			SpecialSavings.withdraw(saver1, 5000.00f);
			saver1.printData2();
			SpecialSavings.withdraw(saver2, 3000.00f);
			saver2.printData2();

	}


}

/* TEST RUN
 * 
 * At Interest Rate of 4.00%
The balance for the account is $2000.00

At Interest Rate of 4.00%
The balance for the account is $3000.00

At Interest Rate of 4.00%
The balance for the account is $3000.00

At Interest Rate of 10.00%
The balance for the account is $13000.00

Balance Error

At Interest Rate of 4.00%
The balance for the account is $3000.00

At Interest Rate of 4.00%
The balance for the account is $10000.00

*/
