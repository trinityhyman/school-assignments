import java.util.Scanner;
//------------------------------------------------------------
//STUDENT NAME: Trinity Hyman
//FILENAME: Assignment3.java
//DESCRIPTION: Outputting names in different variations 
//FOR: CSE 110 - Homework Assignment #3 
//TIME SPENT: 5 days 
//DATE: 2/13/19
//Question #1: a. x >= 0
//			   b. x <= 10
//			   c. x > 10
//			   d. x && 7 == 0
//			   e. x %2 != 0
//Question #2: a. 1 == day && 2 == month
//			   b. 15 < day && 4 >= month
//Question #3: a. word1.compareTo(word2) != 0
//			   b. word1.compareTo(word2) > 0
//			   c. word1.substring(0, 2).equals(word2.substring(0, 2))
//-------------------------------------------------------------
import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {

		// declare variables
		Scanner in = new Scanner(System.in);
		String fullName = "";
		String firstName = "";
		String lastName = "";
		String middleName = "";

		// scan in user's full name
		System.out.println("What are your first, middle and last names?"); // prompt
		fullName = in.nextLine();

		// declare variables after asking for full name
		int indexOfFirstSpace = fullName.indexOf(" ");
		int indexOfLastSpace = fullName.lastIndexOf(" ");

		// get last name
		lastName = fullName.substring(indexOfLastSpace + 1);
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

		// get first name
		firstName = fullName.substring(0, indexOfFirstSpace);
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		
		// get middle name
		if (indexOfFirstSpace != indexOfLastSpace) {
			middleName = fullName.substring(indexOfFirstSpace + 1, indexOfLastSpace);
			middleName = middleName.substring(0, 1).toUpperCase() + middleName.substring(1).toLowerCase();
		}
		
		/* print initials by taking just the first letters of the first, middle, and last names,
		 or just the first and last name if there is no middle name*/	
		if (indexOfFirstSpace < indexOfLastSpace) {
			System.out.println("Initials: " + firstName.substring(0, 1) + "." + middleName.substring(0, 1) + "."
					+ lastName.substring(0, 1) + "."); // prompt
		} else {
			System.out.println("Initials: " + firstName.substring(0, 1) + "." + lastName.substring(0, 1) + "."); // prompt
		}
		
		// print the last name then first name separated by a comma, then the initial for the middle name
		if (indexOfFirstSpace < indexOfLastSpace) {
			System.out.println("Last Name First: " + lastName + ", " + firstName + " " + middleName.substring(0, 1).toUpperCase() + "."); // prompt
		} else {
			System.out.println("Last Name First: " + lastName + ", " + firstName); // prompt
		}
		
		// print the first and last name
		System.out.println("First and Last: " + firstName + " " + lastName); // prompt
	}
}
