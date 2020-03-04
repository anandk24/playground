package com.ana.easy;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {

		System.out.println("Enter the 2 strings to check for anagram");

		Scanner scanner = new Scanner(System.in);
		String strgs[] = new String[2];
		int i = 0;
		while (scanner.hasNext()) {
			strgs[i++] = scanner.next();
			if (i == 2) {
				scanner.close();
				break;
			}
		}
		//display string arrays using streams+foreach
		Arrays.stream(strgs).forEach(j -> System.out.println(j));

		boolean isAnagram = isAnagram(strgs[0], strgs[1]);
		System.out.println("Is it Anagram -> " + isAnagram);
	}

	/**
	 * sort both strings and then make sure they are same
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	private static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length())
			return false;

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);

		for (int i = 0; i < s1.length; i++)
			if (s1[i] != s2[i])
				return false;

		return true;
	}
}
