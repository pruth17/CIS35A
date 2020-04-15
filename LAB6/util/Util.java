/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */

package util;

import java.io.*;
import java.util.StringTokenizer;
import lab2.Student;

public class Util {
	// instance variables

	private int value = -1;

	public int readFile(String filename, Student[] stu) {
		// this function reads the input file
		// and populates the stu array with the data
		try {
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();

				if (line == null) { // if it reaches the end of file, the loop ends
					eof = true;
				} else {
					if (value > -1 && value < 40) {
						// it populates the array only if value is greater than 0
						// and less than 40

						StringTokenizer st = new StringTokenizer(line);

						while (st.hasMoreTokens()) {
							// converts the studentID into an int
							int x = Integer.parseInt(st.nextToken()); //

							if (x != 0) {

								stu[value] = new Student();

								stu[value].set_SID(x);
								int[] student2 = new int[5];
								for (int i = 0; i < 5; i++) {
									// converts the scores into int
									// and populates the array
									student2[i] = Integer.parseInt(st.nextToken());
								}
								stu[value].set_scores(student2);
							}

						}

					}
					value++;

				}

			}

			buff.close();

		} catch (IOException e) {
			System.out.printf("Error" + e.toString());
		}
		return value;
	}
}
