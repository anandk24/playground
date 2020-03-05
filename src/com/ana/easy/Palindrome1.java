package com.ana.easy;

import java.util.Scanner;

public class Palindrome1 {

	static String palinStr;

	public static void main(String[] args) {
		System.out.println("Enter a string palindrome string...");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext())
			palinStr = scanner.nextLine();
		scanner.close();
		System.out.println("Entered palindrome string : " + palinStr);

		// 1. using StringBuffer
		String reverseStr = new StringBuffer(palinStr).reverse().toString();
		System.out.println("Reversed string using StringBuffer : " + reverseStr);

		displayPalindromeOrNot(reverseStr);

		System.out.println("*******************************************************************");
		// 2. Reversing a string using core java....without using StringBuffer
		
		String str = "";
		for (int i = palinStr.length(); i > 0; i--) {
			str = str + palinStr.charAt(i - 1);
		}
		
		System.out.println("reversed one : " + str);
		displayPalindromeOrNot(str);

	}

	private static void displayPalindromeOrNot(String reverseStr) {
		if (palinStr.equals(reverseStr))
			System.out.println("This is a Palindrome ---- " + palinStr);
		else
			System.out.println("This is NOT a Palindrome ---- " + palinStr);
	}

}
