/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * Extra Credit Lab
 * 3/20/2019
 * 3/20/2019
 */

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Human h = new Human();
		int felt = 0;
		Brain brain = new Brain();
		String feelings[] = new String[5];
		feelings = brain.getThinking();

		System.out.printf(" \t\t\t Hello, Welcome to your Brain!");
		do {

			System.out.printf("\nHow are u felling today.\n");

			for (int i = 0; i < feelings.length; i++)
				System.out.printf(i + 1 + " " + feelings[i] + " \n");// feelings printed
			System.out.printf("Please choose a number based on your fellings: ");
			felt = inp.nextInt();
		} while (felt > 5 || felt < 0);
		// if - else statment based on the input
		// given by the user
		if (felt == 2) {
			brain.setDepartment(felt - 1);
			System.out.printf("\n\nLets change your feelings from Sad to happy.\n");
			System.out.printf("You will have to try to remain free minded for 10 min\n");
			h.concentrate(felt - 1, 10);
			System.out.printf("Thank you for concentrating for 10 min\n");
			System.out.printf("Your brain seems happy\n");
		} else if (felt == 3) {
			brain.setDepartment(felt - 1);
			System.out.printf("\nLets change your feelings from Angry to happy.");
			System.out.printf("You will have to try to remain free minded for 20 min\n");
			h.concentrate(felt - 1, 20);
			System.out.printf("Thank you for concentrating for 20 min\n");
			System.out.printf("Your brain seems happy\n");
		} else if (felt == 4) {
			brain.setDepartment(felt - 1);
			System.out.printf("\nLets change your feelings from Depressed to happy.\n");
			System.out.printf("You will have to try to remain free minded for 30 min\n");
			h.concentrate(felt - 1, 30);
			System.out.printf("Thank you for concentrating for 30 min\n");
			System.out.printf("Your brain seems happy\n");
		} else if (felt == 5) {
			brain.setDepartment(felt - 1);
			System.out.printf("\nLets change your feelings from Annoyed to happy\n");
			System.out.printf("You will have to try to remain free minded for 40 min\n");
			h.concentrate(felt - 1, 40);
			System.out.printf("Thank you for concentrating for 40 min\n");
			System.out.printf("Your brain seems happy\n");
		} else {
			brain.setDepartment(felt - 1);
			System.out.printf("\nAmazing to know that you are happy!");
		}

	}
}

/* TEST RUN
 Hello, Welcome to your Brain!
How are u felling today.
1 Happy 
2 Sad 
3 Angry 
4 Depressed 
5 Annoyed 
Please choose a number based on your fellings: 4

Lets change your feelings from Depressed to happy.
You will have to try to remain free minded for 30 min

You are currently in Depressed mood
Trying to change in Happy mood

Thank you for concentrating for 30 min
Your brain seems happy



 			 Hello, Welcome to your Brain!
How are u felling today.
1 Happy 
2 Sad 
3 Angry 
4 Depressed 
5 Annoyed 
Please choose a number based on your fellings: 8

How are u felling today.
1 Happy 
2 Sad 
3 Angry 
4 Depressed 
5 Annoyed 
Please choose a number based on your fellings: 1

Amazing to know that you are happy!


 			 Hello, Welcome to your Brain!
How are u felling today.
1 Happy 
2 Sad 
3 Angry 
4 Depressed 
5 Annoyed 
Please choose a number based on your fellings: 3

Lets change your feelings from Angry to happy.You will have to try to remain free minded for 20 min

You are currently in Angry mood
Trying to change in Happy mood

Thank you for concentrating for 20 min
Your brain seems happy







*/
