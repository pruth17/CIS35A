/*
 * Pruthvirajsinh Punwar
 * CIS 35A 63Z Online Section
 * LAB 1 Part 2
 * 1/20/19
 * 1/20/19
 */

import java.util.Scanner;
import java.lang.Math;

public class SquareRoot 
{
public static double sqrt(long n)
{
    // declaring variables
	double root = 0;
	double temp = 0;
	double nextGuess = 1;
	double lastGuess = 1;

    
    // loop to calculate the square root
	do
	{
		nextGuess = (lastGuess + n / lastGuess) / 2;
		temp = Math.abs(nextGuess-lastGuess);
		if(temp < 0.0001)
			root = nextGuess;
		else
		
			lastGuess = nextGuess;
	} while (temp >= 0.0001);
	
	return root; // returns root which is a double
}


	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		long root = 0;
		System.out.printf("Please enter a long number: ");
		root = input.nextInt();
		while (root < 0) {
		System.out.printf("Please enter a positive number: ");
		root = input.nextInt();
		}
		double answer = SquareRoot.sqrt(root); // answer has the square root
		
		System.out.printf("The square root of " + root + " is %.2f", answer);
		
		
		input.close();

	}

}

/* Test Runs
 * 
 * Please enter a number: 100
 * The square root of 100 is 10.00
 * 
 * Please enter a number: 0
 * The square root of 0 is 0.00
 * 
 * Please enter a number: 45
 * The square root of 45 is 6.71
 * 
 * Please enter a number: 144
 * The square root of 144 is 12.00
 * 
 * Please enter a number: 1903
 * The square root of 1903 is 43.62
 * 
 * Please enter a number: 345332
 * The square root of 345332 is 587.65
 * 
 * Please enter a long number: -2
 * Please enter a positive number: -4
 * Please enter a positive number: 36
 * The square root of 36 is 6.00
 */
