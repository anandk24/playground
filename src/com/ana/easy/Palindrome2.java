package com.ana.easy;

import java.util.Scanner;

public class Palindrome2 {

	private static String palinStr;

	public static void main(String[] args) {
		System.out.println("Enter a string palindrome string...");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext())
			palinStr = scanner.nextLine();
		scanner.close();
		System.out.println("Entered palindrome string : " + palinStr);
		boolean isPalindrome = true;
		// compare first and last characters of string till we reach center
		for (int i = 0; i <= (palinStr.length() - 1) / 2; i++) {	
			if (palinStr.charAt(i) != palinStr.charAt(palinStr.length() - 1 - i))
				isPalindrome = false;
		}
		displayPalindromeOrNot(isPalindrome);
	}

	private static void displayPalindromeOrNot(boolean isPalindrome) {
		if (isPalindrome)
			System.out.println("This is a Palindrome ---- " + palinStr);
		else
			System.out.println("This is NOT a Palindrome ---- " + palinStr);
	}
}
