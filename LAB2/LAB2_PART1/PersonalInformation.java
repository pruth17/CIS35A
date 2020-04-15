/*
 * Pruthvirajsinh Punwar
 * CIS 35A Online Section
 * LAB 2 PART 1
 * 2/1/2019
 * 2/1/2019
 */

import java.util.Scanner;

public class PersonalInformation {
	private String name;
	private String city;
	private String age;
	private String number;
	private static Scanner inp = new Scanner(System.in);

	PersonalInformation() {
		name = "";
		city = "";
		age = "";
		number = "";
	}

	PersonalInformation(String name1, String city1, String age1, String number1) {
		name = name1;
		city = city1;
		age = age1;
		number = number1;
	}

	public void setData() {

		System.out.printf("%50s", "Enter a name: ");
		name = inp.nextLine();

		System.out.printf("%50s", "Enter your City: ");
		city = inp.nextLine();

		System.out.printf("%50s", "Enter your number: ");
		number = inp.nextLine();

		System.out.printf("%50s", "Enter your age: ");
		age = inp.nextLine();

		System.out.printf("\n\n");

	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getAge() {
		return age;
	}

	public String getNumber() {
		return number;
	}

	public void setName(String name2) {
		name = name2;
	}

	public void setCity(String city2) {
		city = city2;
	}

	public void setAge(String age2) {
		age = age2;
	}

	public void setNumber(String number2) {
		number = number2;
	}

	public void print() {

		System.out.printf("%50s ", "Name: ");
		System.out.printf("%s \n", name);
		System.out.printf("%50s ", "City: ");
		System.out.printf("%s \n", city);
		System.out.printf("%50s ", "Age: ");
		System.out.printf("%s \n", age);
		System.out.printf("%50s ", "Cell Number: ");
		System.out.printf("%s \n", number);
		System.out.printf("\n\n");
	}

	public static void main(String args[]) {
		PersonalInformation Person1 = new PersonalInformation();
		PersonalInformation Person2 = new PersonalInformation();
		PersonalInformation Person3 = new PersonalInformation("Tom Cruise",
				"Los Angeles", "54", "717-098-1234");

		Person1.setData();
		Person2.setData();

		System.out.printf("%67s", "The Data for first object   \n");
		Person1.print();
		System.out.printf("%67s", "The Data for second object   \n");
		Person2.print();
		System.out.printf("%67s", "The Data for third  object  \n");
		Person3.print();

	}
}

/*                                           TEST RUN
 * 
 *                                  Enter a name: Donald Trump
                                 Enter your City: Washington D.C.
                               Enter your number: 1234-56-7890
                                  Enter your age: 72


                                    Enter a name: Barack Obama
                                 Enter your City: Chicago
                               Enter your number: 098-765-4321
                                  Enter your age: 52


                                      The Data for first object   
                                            Name:  Donald Trump 
                                            City:  Washington D.C. 
                                             Age:  72 
                                     Cell Number:  1234-56-7890 


                                     The Data for second object   
                                            Name:  Barack Obama 
                                            City:  Chicago 
                                             Age:  52 
                                     Cell Number:  098-765-4321 


                                      The Data for third  object  
                                            Name:  Tom Cruise
                                            City:  Los Angeles 
                                             Age:  54 
                                     Cell Number:  717-098-1234 


*/
