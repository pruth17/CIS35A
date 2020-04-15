/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 3
 * 2/15/2019
 * 2/15/2019
 */
public class Store {
	// instance variables
	private float salesbyweek[][];
	private float totalSalesForAllWeeks = 0.0f;
	private float avgerageWeeklySales = 0.0f;
	private int highestWeek = 0;
	private int lowestWeek = 0;
	private float total_sales_for_week = 0.0f;
	private float avg_sales_for_week = 0.0f;

	// getters and setters

	public float getTotal_sales_for_week() {
		return total_sales_for_week;
	}

	public void setTotal_sales_for_week(float total_sales_for_week) {
		this.total_sales_for_week = total_sales_for_week;
	}

	public float getAvg_sales_for_week() {
		return avg_sales_for_week;
	}

	public void setAvg_sales_for_week(float avg_sales_for_week) {
		this.avg_sales_for_week = avg_sales_for_week;
	}

	public float[][] getSalesbyweek() {
		return salesbyweek;
	}

	public void setSalesbyweek(float[][] salesbyweek) {
		this.salesbyweek = salesbyweek;
	}

	public float getTotalSalesForAllWeeks() {
		return totalSalesForAllWeeks;
	}

	public void setTotalSalesForAllWeeks(float totalSalesForAllWeeks) {
		this.totalSalesForAllWeeks = totalSalesForAllWeeks;
	}

	public float getAvgerageWeeklySales() {
		return avgerageWeeklySales;
	}

	public void setAvgerageWeeklySales(float avgerageWeeklySales) {
		this.avgerageWeeklySales = avgerageWeeklySales;
	}

	public int getHighestWeek() {
		return highestWeek;
	}

	public void setHighestWeek(int highestWeek) {
		this.highestWeek = highestWeek;
	}

	public int getLowestWeek() {
		return lowestWeek;
	}

	public void setLowestWeek(int lowestWeek) {
		this.lowestWeek = lowestWeek;
	}

	Store() {
		// constructor
		salesbyweek = new float[5][7];
	}

	// this function sets the sale to a specific day and week
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	// prints the data
	public void printdata() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.printf("\n");
		}
	}

	// float [] getsalesforentireweek(int week)
	// returns the sales for entire week for a week
	// entered by the user
	public float[] getsalesforentireweek(int week) {
		float[] sales = new float[7];
		for (int i = 0; i < 7; i++) {
			salesbyweek[week][i] = sales[i];
		}
		return sales;
	}

	// float getsaleforweekdayintersection(int week, int day)
	// returns sales for a specific day of a week
	public float getsaleforweekdayintersection(int week, int day) {
		return salesbyweek[week][day];
	}

	// businessmethod
	// a. totalsalesforweek
	// returns total sales for a specific week.
	public float totalsalesforweek(int week) {
		float totalSalesForWeek = 0;
		for (int i = 0; i < 7; i++) {
			totalSalesForWeek += salesbyweek[week][i];
		}
		return totalSalesForWeek;

	}

	// b. avgsalesforweek
	// returns the average sales for a specifc week
	public float avgsalesforweek(int week) {
		float avgSalesForWeek = 0;
		avgSalesForWeek = totalsalesforweek(week) / 7;
		return avgSalesForWeek;

	}

	// c. totalsalesforallweeks
	// returns total sales for all the weeks
	public float totalsalesforallweeks() {
		float totalSalesForAllWeeks = 0;
		for (int w = 0; w < 5; w++) {
			totalSalesForAllWeeks += totalsalesforweek(w);
		}
		return totalSalesForAllWeeks;
	}

	// d. averageweeklysales
	// returns average weekly sales
	public float averageweeklysales() {
		float averageWeeklySales = 0;
		averageWeeklySales = totalsalesforallweeks() / 5;
		return averageWeeklySales;
	}

	// e. weekwithhighestsaleamts
	// returns the week with highest amount
	// of sales
	public int weekwithhighestsaleamt() {
		int highWeek = 0;
		float sale_per_week = 0;
		float highestSalePerWeek = -1;
		for (int i = 0; i < 5; i++) {
			sale_per_week = totalsalesforweek(i);
			if (sale_per_week > highestSalePerWeek) {
				highestSalePerWeek = sale_per_week;
				highWeek = i + 1;
			}
		}
		return highWeek;
	}

	// f. weekwithlowestsaleamt
	// returns the week with lowest amount
	// of sales
	public int weekwithlowestsaleamt() {
		int lowWeek = 0;
		float sale_per_week = 0;
		float lowestSalesPerWeek = Float.MAX_VALUE;
		for (int i = 0; i < 5; i++) {
			sale_per_week = totalsalesforweek(i);
			if (sale_per_week < lowestSalesPerWeek) {

				lowestSalesPerWeek = sale_per_week;
				lowWeek = i + 1;
			}

		}
		return lowWeek;

	}

	// analyzeresults
	// analyzes the results
	// calls a through f
	public void analyzeresults() {
		// a
		for (int i = 0; i < 5; i++) {
			totalsalesforweek(i);

		}
		// b
		for (int j = 0; j < 5; j++) {
			avgsalesforweek(j);

		}
		// c
		totalSalesForAllWeeks = totalsalesforallweeks();
		// d
		avgerageWeeklySales = averageweeklysales();
		// e
		highestWeek = weekwithhighestsaleamt();
		// f
		lowestWeek = weekwithlowestsaleamt();
	}
	// print()

// this function prints the various options
// the app can perform 
	public void printOpt(int input) {
		UI User = new UI();

		while (input != 8) {

			if (input == 1) {
				System.out.printf("\n");
				for (int i = 0; i < 5; i++) {
					System.out.printf("Total sales for week " + (i + 1) + " is $ ");
					System.out.printf("%.2f", totalsalesforweek(i));
					System.out.printf("\n");
				}
				System.out.printf("\n");

			} else if (input == 2) {
				System.out.printf("\n");
				for (int j = 0; j < 5; j++) {

					System.out.printf("Average daily sales for week " + (j + 1) + " is $ ");
					System.out.printf("%.2f", avgsalesforweek(j));
					System.out.printf("\n");
				}
				System.out.printf("\n");
			}

			else if (input == 3) {
				System.out.printf("\n");
				System.out.printf("Total sales for all weeks is $ ");
				System.out.printf("%.2f", totalsalesforallweeks());
				System.out.printf("\n\n");

			} else if (input == 4) {
				System.out.printf("\n");
				System.out.printf("Average sales for all weeks is $ ");
				System.out.printf("%.2f", averageweeklysales());
				System.out.printf("\n\n");
			}

			else if (input == 5) {
				System.out.printf("\n");
				System.out.printf("Week with highest sale is #");
				System.out.printf("%.2s", weekwithhighestsaleamt());
				System.out.printf("\n\n");
			} else if (input == 6) {
				System.out.printf("\n");
				System.out.printf("Week with lowest sale is #");
				System.out.printf("%.2s", weekwithlowestsaleamt());
				System.out.printf("\n\n");
			}

			else if (input == 7) {

				System.out.printf("\nAll data is as follows:\n");
				for (int i = 0; i < 5; i++) {
					System.out.printf("Total sales for week " + (i + 1) + " is $ ");
					System.out.printf("%.2f", totalsalesforweek(i));
					System.out.printf("\n");
				}
				System.out.printf("\n");
				for (int j = 0; j < 5; j++) {
					System.out.printf("Average sales for week " + (j + 1) + " is $ ");
					System.out.printf("%.2f", avgsalesforweek(j));
					System.out.printf("\n");
				}
				System.out.printf("\n");
				System.out.printf("Total sales for all weeks is $");
				System.out.printf("%.2f", totalsalesforallweeks());
				System.out.printf("\n");
				System.out.printf("Average sales for all weeks is $");
				System.out.printf("%.2f", averageweeklysales());
				System.out.printf("\n");
				System.out.printf("Week with highest sale is #" + weekwithhighestsaleamt());
				System.out.printf("\n");
				System.out.printf("Week with lowest sale is #" + weekwithlowestsaleamt() + "\n\n");

			} else if (input == 8) {
				System.out.printf("Thank you for using the program \n");

			}
			// gets the input from the user again
			// if the user enters 8 the program
			// will end
			Store s = new Store();
			if (User.chooseOption(s))
				input = User.getInput();
		}
	}

}