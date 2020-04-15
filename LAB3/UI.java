/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 3
 * 2/15/2019
 * 2/15/2019
 */
import java.util.Scanner;
import java.util.*;

public class UI {
	// instance variables

	private static Scanner inp = new Scanner(System.in);
	private int store_number;
	private static int input;

	public UI() { // constructor

	}

	public int intro() {
		// this functions prints the introduction in the program
		// returns the choice of the user in int form
		System.out.printf("\t\t\t** Welcome to your Data Analysis App ** \n");
		System.out.printf("\t\t\t**  You can do analysis for 6 stores ** \n");
		System.out.printf("\t\t\t**  from the sales of last 5 weeks   **\n");
		System.out.printf("\t\t\t**   Please select a store number    **\n\n");
		System.out.printf("Please enter 1 through 6: ");
		store_number = inp.nextInt();

		if (store_number >= 1 && store_number <= 6) {
			return store_number;
		} else {
			do {
				System.out.printf("Invalid input\n");
				System.out.printf("Enter between 1 to 6: ");
				store_number = inp.nextInt();

			} while (store_number < 0 || store_number > 6);
			return store_number;
		}
	}
	// getters and setters

	public static int getInput() {
		return input;
	}

	public static void setInput(int input) {
		UI.input = input;
	}

	public static boolean chooseOption(Store s) {

		// displays a menu of operations to the user
		System.out.printf("1) Enter 1 for total sales for each week. \n");
		System.out.printf("2) Enter 2 for average daily sales for each week. \n");
		System.out.printf("3) Enter 3 for total sales for all week. \n");
		System.out.printf("4) Enter 4 for average weekly sales. \n");
		System.out.printf("5) Enter 5 for week with the highest amount in sales. \n");
		System.out.printf("6) Enter 6 for week with the lowest amount in sales. \n");
		System.out.printf("7) Enter 7 for all data. \n");
		System.out.printf("8) Enter 8 to exit. \n");
		System.out.printf("Your choice: ");

		input = inp.nextInt();
		if (input >= 1 && input <= 8)
			return true;
		else {
			System.out.print(" Invalid entry.\n");
			do {
				System.out.printf("Please enter 1 to 8: ");
				input = inp.nextInt();

			} while (input < 1 || input > 8);
			return true;
		}
	}

}
