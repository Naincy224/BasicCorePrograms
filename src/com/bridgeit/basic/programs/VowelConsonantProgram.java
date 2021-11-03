package com.bridgeit.basic.programs;

import java.util.Scanner;

public class VowelConsonantProgram {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch = scan.next().charAt(0);
		scan.close();

		ch = Character.toLowerCase(ch);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("Given character is an vowel");
		} else {
			System.out.println("Given character is a consonant");
		}
	}

}
