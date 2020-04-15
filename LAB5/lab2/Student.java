/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 5
 * 3/6/2019
 * 3/6/2019
 */

package lab2;

public class Student {
	// instance variables
	private int SID;
	private int scores[] = new int[5];

	// getter and setter methods
	public int get_SID() {
		return this.SID;
	}

	public void set_SID(int id) {
		this.SID = id;
	}

	public int[] get_scores() {
		return this.scores;
	}

	public void set_scores(int[] s) {
		this.scores = s;
	}

	// prints the data
	public void print_data() {
		
		int x = get_SID();

		System.out.printf("%d: ", x);
		for (int i = 0; i < 5; i++)
			System.out.printf("%4d ", scores[i]);

		System.out.printf("\n");

	}
	
	public void formatPrint() {

		System.out.printf("  ID ");
		System.out.printf("%5s %5s %3s %4s %4s", "Q1", "Q2","Q3", "Q4","Q5");
		System.out.printf("\n");
		
	}

}
