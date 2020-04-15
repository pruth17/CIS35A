/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */

package adapter;

import lab2.*;
import util.*;

public abstract class StudentAPIImpl {
	// private instance variables

	public final boolean DEBUG = true;
	private Statistics s = new Statistics();
	private FileIO file = new FileIO();

	public StudentAPIImpl() {
	}

	public void printStudentScores(int id) {
		// finds the .ser file of the id and deseralizes the file 
		// then prints the data
		if (DEBUG) {
			StudentGrade readingid = file.readFromDisk(id + ".ser");
			if (readingid != null)
				readingid.print();
			else
				System.out.println("\t\tError! The file requested was not found. Try another one. ");

		}
	}

	public void printStats() {
		// prints the statistics
		if (DEBUG) {
			s.print_statistics();

		}
	}

	public void printStudentInfo(int id) {
		FileIO file = new FileIO();
		StudentGrade reading = file.readFromDisk(id + ".ser");
		int scores[] = reading.getStudent().get_scores();
		System.out.println("Scores for ID " + id + ":");
		for (int i = 0; i < 1; i++) {

			System.out.println(java.util.Arrays.toString(scores));
		}
	}



}
