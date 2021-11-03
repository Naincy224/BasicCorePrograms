package com.bridgeit.basic.programs;

import java.util.Scanner;

public class LargestNumerProgram {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number:");
		a = scan.nextInt();

		System.out.println("Enter the second number:");
		b = scan.nextInt();

		System.out.println("Enter the third number:");
		c = scan.nextInt();
		
		scan.close();
		
		if (a >= b && a >= c)
			System.out.println(a + " is the largest Number");
		
		else if (b >= a && b >= c)
			System.out.println(b + " is the largest Number");
		
		else
			
			System.out.println(c + " is the largest number");

	}

}
