/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 3
 * 2/15/2019
 * 2/15/2019
 */
public class Driver {
	// instance variables
	private static int storenum;

	public static void main(String[] args) {

		// adress of the file in the hard disk
		FileIO a1 = new FileIO("/Users/pruthvi/Desktop/LAB3_Updated/src/Salesdat.txt");
		Franchise f = a1.readData(); // declaring franchise
		UI x = new UI(); // declaring franchise class
		storenum = x.intro(); // getting the store number
		Store s = f.getStores(storenum - 1);
		System.out.println("\nYou selected Store: " + storenum);
		s.analyzeresults(); // analyzing the result for the specific store number
		if (UI.chooseOption(s)) {
			storenum = UI.getInput();
		}
		s.printOpt(storenum); // prints the various options
		System.out.printf("\t\t Thank you for using the app!");
		}

}

/* Test Run 
 * 			** Welcome to your Data Analysis App ** 
			**  You can do analysis for 6 stores ** 
			**  from the sales of last 5 weeks   **
			**   Please select a store number    **

Please enter 1 through 6: 2

You selected Store: 2
1) Enter 1 for total sales for each week. 
2) Enter 2 for average daily sales for each week. 
3) Enter 3 for total sales for all week. 
4) Enter 4 for average weekly sales. 
5) Enter 5 for week with the highest amount in sales. 
6) Enter 6 for week with the lowest amount in sales. 
7) Enter 7 for all data. 
8) Enter 8 to exit. 
Your choice: 1

Total sales for week 1 is $ 12919.52
Total sales for week 2 is $ 17115.00
Total sales for week 3 is $ 21378.00
Total sales for week 4 is $ 25641.00
Total sales for week 5 is $ 29904.00

1) Enter 1 for total sales for each week. 
2) Enter 2 for average daily sales for each week. 
3) Enter 3 for total sales for all week. 
4) Enter 4 for average weekly sales. 
5) Enter 5 for week with the highest amount in sales. 
6) Enter 6 for week with the lowest amount in sales. 
7) Enter 7 for all data. 
8) Enter 8 to exit. 
Your choice: 3

Total sales for all weeks is $ 106957.52

1) Enter 1 for total sales for each week. 
2) Enter 2 for average daily sales for each week. 
3) Enter 3 for total sales for all week. 
4) Enter 4 for average weekly sales. 
5) Enter 5 for week with the highest amount in sales. 
6) Enter 6 for week with the lowest amount in sales. 
7) Enter 7 for all data. 
8) Enter 8 to exit. 
Your choice: 5

Week with highest sale is #5

1) Enter 1 for total sales for each week. 
2) Enter 2 for average daily sales for each week. 
3) Enter 3 for total sales for all week. 
4) Enter 4 for average weekly sales. 
5) Enter 5 for week with the highest amount in sales. 
6) Enter 6 for week with the lowest amount in sales. 
7) Enter 7 for all data. 
8) Enter 8 to exit. 
Your choice: 6

Week with lowest sale is #1

1) Enter 1 for total sales for each week. 
2) Enter 2 for average daily sales for each week. 
3) Enter 3 for total sales for all week. 
4) Enter 4 for average weekly sales. 
5) Enter 5 for week with the highest amount in sales. 
6) Enter 6 for week with the lowest amount in sales. 
7) Enter 7 for all data. 
8) Enter 8 to exit. 
Your choice: 2

Average daily sales for week 1 is $ 1845.65
Average daily sales for week 2 is $ 2445.00
Average daily sales for week 3 is $ 3054.00
Average daily sales for week 4 is $ 3663.00
Average daily sales for week 5 is $ 4272.00

1) Enter 1 for total sales for each week. 
2) Enter 2 for average daily sales for each week. 
3) Enter 3 for total sales for all week. 
4) Enter 4 for average weekly sales. 
5) Enter 5 for week with the highest amount in sales. 
6) Enter 6 for week with the lowest amount in sales. 
7) Enter 7 for all data. 
8) Enter 8 to exit. 
Your choice: 7

All data is as follows:
Total sales for week 1 is $ 12919.52
Total sales for week 2 is $ 17115.00
Total sales for week 3 is $ 21378.00
Total sales for week 4 is $ 25641.00
Total sales for week 5 is $ 29904.00

Average sales for week 1 is $ 1845.65
Average sales for week 2 is $ 2445.00
Average sales for week 3 is $ 3054.00
Average sales for week 4 is $ 3663.00
Average sales for week 5 is $ 4272.00

Total sales for all weeks is $106957.52
Average sales for all weeks is $21391.50
Week with highest sale is #5
Week with lowest sale is #1

1) Enter 1 for total sales for each week. 
2) Enter 2 for average daily sales for each week. 
3) Enter 3 for total sales for all week. 
4) Enter 4 for average weekly sales. 
5) Enter 5 for week with the highest amount in sales. 
6) Enter 6 for week with the lowest amount in sales. 
7) Enter 7 for all data. 
8) Enter 8 to exit. 
Your choice: 8
		 Thank you for using the app!
		 
		 */
