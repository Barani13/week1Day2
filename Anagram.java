package mavenproject;

import java.util.Arrays;

public class Anagram {


	
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */
	public static void main(String[] args) {
		String text1="stops";
		String text2="potss";
				int Length1=text1.length();
				int Length2=text2.length();
				if(Length1==Length2) {
					System.out.println("Both Strings Are Equal");
					char [] arr1=text1.toCharArray();
					char[] arr2=text2.toCharArray();
					Arrays.sort(arr1);
					Arrays.sort(arr2);
				
				if(Arrays.equals(arr1, arr2)) {
					System.out.println("Anagram");
					
				}
	}
}
}
