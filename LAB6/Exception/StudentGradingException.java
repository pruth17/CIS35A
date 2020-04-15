/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */
package Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StudentGradingException extends Exception {
	private int errorno;
	private String errormsg;

	public StudentGradingException() {
		super();
		printmyproblem();
	}

	public StudentGradingException(String errormsg) {
		super();
		this.errormsg = errormsg;
		printmyproblem();
	}

	public StudentGradingException(int errorno) {
		super();
		this.errorno = errorno;
		printmyproblem();
	}

	public StudentGradingException(int errorno, String errormsg) {
		super();
		this.errorno = errorno;
		this.errormsg = errormsg;
		printmyproblem();
	}

	public int getErrorno() {
		return errorno;
	}

	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	// This method Logs and displays the error number and the coressponding
	// error message to the file and the screen respectively.
	public void printmyproblem() {
		try {
			String print = "FixProblems [errorno=" + errorno + ", errormsg=" + errormsg + "\n";
			File file = new File("Logs22.txt⁩");

			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(print);
			bw.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("FixProblems [errorno=" + errorno + ", errormsg=" + errormsg + "\n");
		System.out.println("Exception logged in  Text file.");

	}

	public String fixProblemReadFromConsole() {
		String a = "//Users//pruthvi//Desktop/LOGfiLE.txt";
		System.out.println("got here --> fixProblemReadFromConsole");
		return a;
	}
}
