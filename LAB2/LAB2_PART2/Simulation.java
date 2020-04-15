/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 2 PART 2
 * 2/1/2019
 * 2/1/2019
 */
public class Simulation {

	private final int TOTAL_TOSSES = 20; //  for the loop

	public void LoopToss(CoinToss c) {

		int heads = 0;
		int tails = 0;
		for (int i = 0; i < TOTAL_TOSSES; i++) {
			c.toss();
			if (c.getSideUp() == "Heads") {
				heads++; //increases the head counter if the toss is heads
				System.out.printf("H ");
			} else {
				tails++; // increases the tails counter if the toss in tails 
				System.out.printf("T ");
			}

		}
		System.out.printf("\nThe total number of Heads is: " + heads + "\n");
		System.out.printf("The total number of Tails is: " + tails + "\n\n");
	}
}
