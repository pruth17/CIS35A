/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */

package Exception;

import java.io.FileInputStream;
import lab2.Student;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.*;
import java.util.*;

public class CreateException {
	private String fileName;

	// class default constructor
	CreateException() {

	}

	public CreateException(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	// This method would try and open the file that the driver instructs to open.
	// throws StudentGradingException as the file does not exist

	public boolean openFile() throws StudentGradingException {
		FileInputStream a1 = null;
		boolean flag = false;
		try {
			a1 = new FileInputStream(fileName);
			System.out.println("Now it is done!");
			flag = true;
		} catch (FileNotFoundException f) // This would catch FileNotFoundException.
		{
			throw new StudentGradingException(1, f.getMessage());
		} catch (Exception f) // This would catch any other exception that occurs other than
								// FileNotFoundException
		{
			throw new StudentGradingException(2, f.getMessage());
		} finally {

		}
		return flag;
	}

	public void buildStudent(Student[] a1, int counter, String temp) throws StudentGradingException {
		// throws StudentGradingException if we are missing the token
		// in the string
		String s1;
		int stuID, qScore, QNumber;
		int count = 0;
		StringTokenizer st = new StringTokenizer(temp);
		try {
			s1 = st.nextToken();

			stuID = Integer.parseInt(s1);

			a1[counter].set_SID(stuID);
			int[] student2 = new int[5];
			for (QNumber = 0; QNumber < 5; QNumber++) {
				student2[QNumber] = Integer.parseInt(st.nextToken());

			}
			a1[count].set_scores(student2);
			count++;

		} catch (Exception e) {
			throw new StudentGradingException(3, "Missing Token");
		}

	}
}
