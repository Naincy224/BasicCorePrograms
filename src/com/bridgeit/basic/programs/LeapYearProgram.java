package com.bridgeit.basic.programs;

import java.util.Scanner;

public class LeapYearProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the year: ");
		int year = input.nextInt(); // Getting an year
		System.out.println(year);
		input.close();
		int length = String.valueOf(year).length();

		if (length == 4) {

			if (year % 4 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not Leap Year");
			}

		} else {
			System.out.println("Please enter a positive 4 digit number");
		}

	}

}
