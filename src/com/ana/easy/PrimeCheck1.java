package com.ana.easy;

import java.util.Scanner;

public class PrimeCheck1 {

	static int n;
	/**
	 * We only have to loop through 2 to half of n, because no number is divisible by more than its half.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter an integer number...");
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext())
			n = scanner.nextInt();
		scanner.close();
		System.out.println(n);
		boolean isPrime = true;

		for (int i = 2; i <= n / 2; i++) {		
			//condition for NOT prime
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println("isPrime=" + isPrime);
	}
}
