//******************************************************************************************
//LeapYear.java		 	Author: Harrison Fox 
//
//Implements a main method to read an integer value year from a user from 1582 onward and  
//determine if that year is a leap year.
//******************************************************************************************

import java.util.*;

public class LeapYear {

	public static void main (String[] args){
		String userInput;
		int year;
		int done = 1;

		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to LeapYear would you like to test if a year is a leap year?");
		System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
		done = scan.nextInt();

		while (done > 0){

			System.out.println("Please enter the Gregorian calendar year you would like to test from 1582 to 10000.");
			userInput = scan.next();

			IntTest test = new IntTest(userInput);

			year = test.getInt();

			if (test.isValid() && year >= 1582 && year <= 10000){ // This if statement provides proper bounds checking for the year entered
				if(year%4 == 0){
					if(year%100 == 0 && year%400 != 0){
						System.out.println("The year you entered is not a Gregorian calendar leap year from 1582 to the year 10000.");
					}
					else{
						System.out.println("The year you entered is a Gregorian calendar leap year from 1582 to the year 10000.");
					}
				}
				else{
					System.out.println("The year you entered is not a Gregorian calendar leap year from 1582 to the year 10000.");
				}
			}
			else{
				System.out.println("The number you entered is not a valid Gregorian calendar year from 1582 to the year 10000.");
			}

			System.out.println("Would you like to test if another year is a leap year?");
			System.out.println("Please enter 1 for \"Yes\" and 0 for \"No\"");
			done = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("Thank you for using LeapYear!" + "\n");
	}
}
