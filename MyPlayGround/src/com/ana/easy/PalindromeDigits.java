package com.ana.easy;

import java.util.Scanner;

public class PalindromeDigits {

	private static int palinNum;

	public static void main(String[] args) {
		System.out.println("Enter a string palindrome number...");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext())
			palinNum = scanner.nextInt();
		System.out.println("Entered number is : " + palinNum);
		scanner.close();

		int reversedNum = 0;
		int remainder = 0;
		int quotient = palinNum;
		while (quotient != 0) {
			remainder = quotient % 10;
			quotient = quotient / 10;
			reversedNum = reversedNum * 10 + remainder;
		}	
		System.out.println("Reversed number is : " + reversedNum);
		
		if(palinNum == reversedNum)
			System.out.println(palinNum + " is a Palindrome");
		else
			System.out.println("this is NOT a Palindrome");
	}

}
