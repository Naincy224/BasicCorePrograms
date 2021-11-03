package com.bridgeit.basic.programs;

import java.util.Scanner;

public class PowersOfTwo {
	
    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		int number = input.nextInt(); 
		input.close();
        int powerOfTwo = 1; 

        for (int i=1;i <= number;i++) {
            powerOfTwo = 2 * powerOfTwo;      
            System.out.println(powerOfTwo);
        }

    }
}