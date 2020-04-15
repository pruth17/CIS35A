/* Pooja Pathak 
 * CIS 35A Java Programming - Online Section
 * Lab 6 
 * Due date : Saturday, 8th December, 2018
 * Date submitted : Monday, 10th December, 2018 (with granted extension)
 * Prints student information.
 */
package util;

import java.io.Serializable;

import lab2.Statistics;
import lab2.Student;

public class SerializedGrades implements Serializable {

	private Student s[] = null;
	private Statistics st = null;

	public SerializedGrades(Student[] s, Statistics st) {
		this.s = s;
		this.st = st;
	}

	public void print() {
		for (Student stu : s)
			stu.print_data();

	}

}
