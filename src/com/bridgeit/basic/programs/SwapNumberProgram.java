package com.bridgeit.basic.programs;

import java.util.Scanner;

public class SwapNumberProgram {

	public static void main(String[] args) {
		   
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first number");
		int x = scan.nextInt();

		System.out.println("Enter the second number");
		int y = scan.nextInt();

		scan.close();
		
		System.out.println("Before Swapping numbers are: ");
		
		System.out.println("First Number is " + x);
		System.out.println("Second Number is " + y);
		

		x = x + y;      
        y = x - y;      
        x = x - y;      
         
		

		System.out.println("After Swapping numbers are: ");
		
		System.out.println("First Number is " + x);
		System.out.println("Second Number is " + y);
	}

}


