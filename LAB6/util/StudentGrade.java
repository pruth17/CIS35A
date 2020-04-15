/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */
package util;

import java.io.Serializable;

import lab2.Statistics;
import lab2.Student;

public class StudentGrade implements Serializable {

	private Student x;
	private Statistics y;

	public StudentGrade(Student x, Statistics y) {
		this.x = x;
		this.y = y;
	}

	public Student getX() {
		return x;
	}

	public void setX(Student x) {
		this.x = x;
	}

	public Statistics getY() {
		return y;
	}

	public void setY(Statistics y) {
		this.y = y;
	}

	public Student getStudent() {

		return x;
	}

	public void print() {
		x.print_data();
		y.print_statistics();
	}

}
