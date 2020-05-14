package programs.dailyChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseEvenIndexInSentence {

//	2. Write a java program to do the following.
//	Input: "When the world realise its own mistake, corona will dissolve automatically"
//	output: "When eht world esilaer its nwo mistake, anoroc will evlossid automatically"

	public static void method1(String input) {
		String[] inputArray = input.split(" ");
		for (int i = 1; i < inputArray.length; i = i + 2) {
			inputArray[i] = reverseString(inputArray[i]);
		}

		String output = Arrays.toString(inputArray).replaceAll("[\\[,\\]]", "");
		System.out.println("Method1");
		System.out.println(output);
	}
	
//------------------------------------------------------------------------------------------------------//	

	public static void method2(String input) {
		String[] inputArray = input.split(" ");

		for (int i = 1; i < inputArray.length; i = i + 2) {

			char[] c = inputArray[i].toCharArray();
			char[] b = new char[c.length];
			int k = 0;
			for (int j = c.length - 1; j >= 0; j--) {
				b[k] = c[j];
				k++;
			}
			inputArray[i] = Arrays.toString(b).replaceAll("[\\s]", "");
		}
		String output = Arrays.toString(inputArray).replaceAll("[\\[,\\]]", "");
		System.out.println("Method2");
		System.out.println(output);
	}
//------------------------------------------------------------------------------------------------------//	

	public static void method3(String input) {
		String[] inputArray = input.split(" ");
		String reversedString = new String();
		for(int i = 1; i<inputArray.length; i++) {
			StringBuilder sb = new StringBuilder(inputArray[i]);
			reversedString = sb.reverse().toString();
			inputArray[i] = reversedString;
		}
		String output = Arrays.toString(inputArray).replaceAll("[\\[,\\]]", "");
		System.out.println("Method3");
		System.out.println(output);
		
	}
	
//------------------------------------------------------------------------------------------------------//		
	
	public static String reverseString(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverseString(input.substring(0, input.length() - 1));
	}

//------------------------------------------------------------------------------------------------------//	
	public static void main(String[] args) {
		String input = "When the world realise its own mistake, corona will dissolve automatically";

		method1(input);
		method2(input);
		method3(input);
	}

}
