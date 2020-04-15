/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */

package Driver;

import Exception.CreateException;
import Exception.StudentGradingException;
import lab2.Statistics;
import lab2.Student;
import util.Util;

public class Driver1 {

	public static void main(String[] args) {

		boolean problemFixed = false;
		System.out.println("\t\t\t\tFixing Exception");
		// Creating a new instance of the CreateException class.
		CreateException myproblem = new CreateException("randomfilename.txt");
		do {
			try {
				// Here we try to open the file that doesn't exist
				// . Error is thrown because the file doesn't exist.
				problemFixed = myproblem.openFile();

			} catch (StudentGradingException e) {
				// We catch the error and change the problemFixed Flag to true to exit
				// the loop and log and print the exceptions that occured in the run time.

				myproblem.setFileName(e.fixProblemReadFromConsole());
				problemFixed = true;
			}
		} while (problemFixed == false);

		CreateException anotherproblem = new CreateException("//Users//pruthvi//Desktop//tt.txt");

		try {
			// here we try to tokeznize a string which is missing a data
			//
			Util input = new Util();
			Student c35a[] = new Student[40];
			int value = 0;
			String temp = "100 45 55 33";
			// value = input.readFile("//Users//pruthvi//Desktop//tt.txt",c35a);
			anotherproblem.buildStudent(c35a, value, temp);

		} catch (StudentGradingException e) {
			e.printmyproblem();

		}
	}

}

/* TEST RUN
 				Fixing Exception
FixProblems [errorno=1, errormsg=randomfilename.txt (No such file or directory)

Exception logged in  Text file.
got here --> fixProblemReadFromConsole
FixProblems [errorno=3, errormsg=Missing Tokens

Exception logged in  Text file.
FixProblems [errorno=3, errormsg=Missing Tokens

Exception logged in  Text file.
*/
