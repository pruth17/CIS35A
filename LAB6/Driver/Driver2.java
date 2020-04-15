/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */

package Driver;

import lab2.*;
import util.*;

public class Driver2 {

	public static void main(String[] args) {

		Util input = new Util();
		Student c35a[] = new Student[40];
		int value = 0;
		value = input.readFile("//Users//pruthvi//Desktop//tt.txt", c35a); // reading the file

		Statistics stat = new Statistics(); // create Statistics object

		FileIO file = new FileIO(); // create FileIO object

		StudentGrade arr[] = new StudentGrade[40];
		value--;
		// doing the statistics of the data
		stat.findlow(c35a, value);
		stat.findhigh(c35a, value);
		stat.findavg(c35a, value);
		// stat.print_statistics();

		for (int i = 0; i < c35a.length; i++) {
			if (c35a[i] != null) // avoiding NPE.
				arr[i] = new StudentGrade(c35a[i], stat);
		}


		for (int i = 0; i < 40; i++) {
			// creating .ser files
			if (arr[i] != null) {
				file.writeToDisk(arr[i], (arr[i].getStudent().get_SID()) + ".ser");
				System.out.println(arr[i].getStudent().get_SID() + ".ser created.");
			}
		}
	
	}
}

/* TEST RUN
1234.ser created.
2134.ser created.
3124.ser created.
4532.ser created.
5678.ser created.
6134.ser created.
7874.ser created.
8067.ser created.
9893.ser created.
1947.ser created.
2877.ser created.
3189.ser created.
4602.ser created.
5405.ser created.
6999.ser created.
6475.ser created.
6475.ser created.
4923.ser created.
3316.ser created.
8416.ser created.
3902.ser created.
7229.ser created.
5671.ser created.
3314.ser created.
3069.ser created.
2573.ser created.
8796.ser created.
5996.ser created.
3417.ser created.
7450.ser created.
1666.ser created.
6122.ser created.
9530.ser created.
4382.ser created.
8461.ser created.
3278.ser created.
3892.ser created.
5959.ser created.
9452.ser created.
8382.ser created.
*/
