/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 6
 * 3/23/2019
 * 3/23/2019
 */
//Serialization is the conversion of an object to a series of bytes, so that the object can be easily saved to persistent storage or streamed across a communication link. 
//The byte stream can then be deserialized - converted into a replica of the original object.
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIO {

	// Serializing StudentGrade
	public void writeToDisk(StudentGrade a1, String fname) {
		try {
			FileOutputStream f = new FileOutputStream(fname);
			ObjectOutputStream f1 = new ObjectOutputStream(f);
			f1.writeObject(a1);
			f1.close();
		} catch (Exception e) {
			System.out.println("\t\t\tError! " + e.toString());

		}
	}

	// Deserializing StudentGrade
	public StudentGrade readFromDisk(String path) {
		StudentGrade a = null;
		try {
			FileInputStream p = new FileInputStream(path);
			ObjectInputStream p1 = new ObjectInputStream(p);
			a = (StudentGrade) p1.readObject();
			p1.close();
		} catch (Exception e) {
			System.out.println("\t\t\tError! File not found ");

		}
		return a;
	}


}
