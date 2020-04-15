/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * Extra Credit Lab
 * 3/20/2019
 * 3/20/2019
 */

public class ThoughtArea {
	// private instances of different
	// thought areas

	private String x1;
	private String x2;
	private String x3;
	private String x4;
	private String x5;

	// returns the feeling based
	// on the department number
	public String getFeeling(int x) {
		if (x == 1)
			return x1;
		else if (x == 2)
			return x2;
		else if (x == 3)
			return x3;
		else if (x == 4)
			return x4;
		else if (x == 5)
			return x5;
		else
			return "";
	}

	// focus function
	// which tells us which thought area
	// is being focused
	public void focus(String x) {
		System.out.printf("\nYou are currently in " + x + " mood");
		System.out.println("\nTrying to change in Happy mood\n");

	}

}
