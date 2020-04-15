/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */

package lab2;

import java.io.Serializable;

public class Statistics implements Serializable {
	// instance variables
	int[] lowscores = new int[5];
	int[] highscores = new int[5];
	float[] avgscores = new float[5];

	public void findlow(Student[] a, int s) {
		/*
		 * This method will find the lowest score and store it in an array names
		 * lowscores.
		 */
		for (int i = 0; i < 5; i++) {
			int[] scores = a[0].get_scores();
			int low = scores[i];

			for (int j = 0; j < s; j++) {
				scores = a[j].get_scores();
				if (low > scores[i]) {
					low = scores[i];
				}
			}
			lowscores[i] = low;
		}
	}

	public void findhigh(Student[] a, int s) {
		/*
		 * This method will find the highest score and store it in an array names
		 * highscores.
		 */
		for (int i = 0; i < 5; i++) {
			int[] scores = a[0].get_scores();
			int high = scores[i];

			for (int j = 0; j < s; j++) {
				scores = a[j].get_scores();
				if (high < scores[i]) {
					high = scores[i];
				}
			}
			highscores[i] = high;
		}
	}

	public void findavg(Student[] a, int s) {
		/*
		 * This method will find avg score for each quiz and store it in an array names
		 * avgscores.
		 */
		float newFloat = (float) s;
		for (int i = 0; i < 5; i++) {
			float sum_for_average = 0;
			for (int j = 0; j < s; j++) {

				int[] score = a[j].get_scores();
				float scores = (float) score[i];
				sum_for_average = sum_for_average + scores;
			}
			avgscores[i] = sum_for_average / newFloat;
		}
	}

	public void print_statistics() {
		// This method prints the lowest scores, highest scores and
		// average scores from each quiz.

		System.out.printf("Lowest score:   ");
		for (int i = 0; i < 5; i++)
			System.out.printf("%6d ", lowscores[i]);
		System.out.printf("\n");
		System.out.printf("High score:     ");
		for (int h = 0; h < 5; h++)
			System.out.printf("%6d ", highscores[h]);
		System.out.printf("\n");
		System.out.printf("Average score:  ");
		System.out.printf("%8.1f ", avgscores[0]);
		System.out.printf("%6.1f ", avgscores[1]);
		System.out.printf("%6.1f ", avgscores[2]);
		System.out.printf("%6.1f ", avgscores[3]);
		System.out.printf("%6.1f ", avgscores[4]);

		System.out.printf("\n");

	}
}
