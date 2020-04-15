/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * Extra Credit Lab
 * 3/20/2019
 * 3/20/2019
 */

public class Human {
	private Brain brain;

	Human() {
		brain = new Brain(); // containment - when an object (an instance
		// variable is created with outer object creation.
	}

	// concentrates upon a thought area
	// based on the duration
	public void concentrate(int department1, int duration) {
		long timer = 0;
		brain.awareness(brain.getT(), department1);
		for (timer = 0; timer < duration; timer++)
			brain.setDepartment(department1);
		brain.setAwareness(department1);
	}
}
