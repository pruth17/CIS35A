/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */

package Driver;

import java.util.Scanner;

import adapter.StudentAPI;
import adapter.StudentAPIImpl;
import adapter.StudentAPIUsage;

public class Driver3 {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int id = 0;
	
		StudentAPI a1 = new StudentAPIUsage();

		System.out.printf("\n\t\t\t\tEnter the student ID: "); // Ask user to enter a student ID and find corresponding
																// quiz scores
		id = input.nextInt();
		a1.printStudentScores(id);
		
	}

}
/* TEST RUN
 
				Enter the student ID: 1234
1234:   52   70   95   78   98 
Lowest score:       44     44     43     49     50 
High score:         98    100     99    100     98 
Average score:      76.7   74.4   78.3   77.5   78.5 


				Enter the student ID: 8461
8461:   86   44   81   95   56 
Lowest score:       44     44     43     49     50 
High score:         98    100     99    100     98 
Average score:      76.7   74.4   78.3   77.5   78.5 


				Enter the student ID: 3443
			Error! File not found 
		Error! The file requested was not found. Try another one. 


 */

