/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * Extra Credit Lab
 * 3/20/2019
 * 3/20/2019
 */

public class Brain {
	// emotion brain can experience.
	// 1 = happy, 2 = sad 3= angry, 4 = depressed, 5 = annoyed
	private int awareness; // department # I am focusing on
	private ThoughtArea T = new ThoughtArea();
	private String thinking[] = { "Happy", "Sad", "Angry", "Depressed", "Annoyed" };
	private int department1;

	Brain() {
	}

	// gettere and setters

	public int getAwareness() {
		return awareness;
	}

	public void setAwareness(int awareness) {
		this.awareness = awareness;
	}

	public ThoughtArea getT() {
		return T;
	}

	public void setT(ThoughtArea t) {
		T = t;
	}

	public String[] getThinking() {
		return thinking;
	}

	public void setThinking(String[] thinking) {
		this.thinking = thinking;
	}

	public int getDepartment1() {
		return department1;
	}

	public void setDepartment(int department) {
		this.department1 = department;
	}

	// awarenedd function which calls the focus function
	// through thought area
	public void awareness(ThoughtArea T, int x) {
		// int x = getDepartment1();
		if (x == 0)
			T.focus("Happy");
		else if (x == 1)
			T.focus("Sad");
		else if (x == 2)
			T.focus("Angry");
		else if (x == 3)
			T.focus("Depressed");
		else if (x == 4)
			T.focus("Annoyed");

	}

}
