package com.bridgeit.basic.programs;

import java.util.Scanner;

class HarmonicProgram {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		double number = input.nextInt();
		input.close();

		double sum = 0;

		for (double i = 1; i <= number; i++) {
			sum = sum + (1 / i);
			
		}
		System.out.println("sum of the series upto " + number + " is " + sum);
	}
}