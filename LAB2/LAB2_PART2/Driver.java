/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 2 PART 2
 * 2/1/2019
 * 2/1/2019
 */
public class Driver {

	public static void main(String[] args) {

		CoinToss quarter = new CoinToss(); // object for cointoss class 
		CoinToss dime = new CoinToss();
		CoinToss nickel = new CoinToss();

		Simulation s1 = new Simulation();
		System.out.printf("These are the tosses for the quarter:\n\n");
		s1.LoopToss(quarter);

		Simulation s2 = new Simulation();
		System.out.printf("These are the tosses for the dime:\n\n");
		s2.LoopToss(dime);

		Simulation s3 = new Simulation();
		System.out.printf("These are the tosses for the nickel:\n\n");
		s3.LoopToss(nickel);
	}
}

/* TEST RUN
 * These are the tosses for the quarter:

H H H T T T H H T T T H H T H T T T T H 
The total number of Heads is: 9
The total number of Tails is: 11

These are the tosses for the dime:

H T T T H H H H H T H H H H H T H H T T 
The total number of Heads is: 13
The total number of Tails is: 7

These are the tosses for the nickel:

H H H T H T T T H T H H T H H H T T T T 
The total number of Heads is: 10
The total number of Tails is: 10

************************************************
These are the tosses for the quarter:

T H H T T T T T T T H T H H T T T T T T 
The total number of Heads is: 5
The total number of Tails is: 15

These are the tosses for the dime:

H T H H T T H T T T H H H H H H H T T H 
The total number of Heads is: 12
The total number of Tails is: 8

These are the tosses for the nickel:

T H T T H T H H T T H T T H H T H H H T 
The total number of Heads is: 10
The total number of Tails is: 10

************************************************
These are the tosses for the quarter:

H T H H H T T T T T T T T H H H H T H T 
The total number of Heads is: 9
The total number of Tails is: 11

These are the tosses for the dime:

H H T H H T T H H H H H H H H H T H T T 
The total number of Heads is: 14
The total number of Tails is: 6

These are the tosses for the nickel:

T T H H T H H T T T T H H H T H T T T T 
The total number of Heads is: 8
The total number of Tails is: 12





 * 
 */






