/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 3
 * 2/15/2019
 * 2/15/2019
 */
import java.io.*;
import java.util.*;

public class FileIO {
	// instance variables
	private String fname = null;
	private boolean DEBUG = false;

	public FileIO(String fname) {// constructor
		this.fname = fname;
	}

	public Franchise readData() { // this function reads the file
		Franchise a1 = null; // declaring variable for franchise
		int counter = 0; // counter used to read the specific lines
		try { // try and catch block starts
			FileReader file = new FileReader(fname); // reads the file name
			BufferedReader buff = new BufferedReader(file); // declaring the buffer
			String temp;
			boolean eof = false;
			while (!eof) { // loop till the reader reaches the end of file
				String line = buff.readLine();
				counter++;
				if (line == null)
					eof = true;
				else {
					if (DEBUG)
						System.out.println("Reading" + line);
					if (counter == 1) {
						temp = line;
						// converts string to int
						a1 = new Franchise(Integer.parseInt(temp));
						if (DEBUG)
							System.out.println("d  " + a1.numberofstores());
					}
					if (counter == 2)
						;
					if (counter > 2) {
						int x = buildStore(a1, (counter - 3), line); // sets the data with
						// the store class
						if (DEBUG)
							System.out.println("Reading Store # " + (counter - 2) + " Number of weeks read =  " + x);
						if (DEBUG) { // used for debugging purposes
							System.out.println("Data read:");
							a1.getStores(counter - 3).printdata();
						}
					}
				}
			}
			buff.close();
		} catch (Exception e) // try catch block ends
		{
			System.out.println("Error -- " + e.toString()); // tells where the exception is
		}
		return a1;
	}

	// This function builds the franchise class with the data read from
	// the output file
	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store();
		String s1 = "";
		float sale = 0.0f;
		int week = 0;
		int day = 0;
		StringTokenizer st = new StringTokenizer(temp);
		while (st.hasMoreTokens()) {
			for (day = 0; day < 7; day++) {
				s1 = st.nextToken();
				sale = Float.parseFloat(s1);
				tstore.setsaleforweekdayintersection(week, day, sale);
			}
			week++;
		}
		a1.setStores(tstore, counter);
		return week;
	}
}
