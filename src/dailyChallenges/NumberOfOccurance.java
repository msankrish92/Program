package programs.dailyChallenges;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurance {
//	1. Write a Java Program to find the occurance of the character 'o' in the following String.
//	Input: "You have no choice other than following me!"
//	output: Occurance of o is: 6
	
	public static void method1(String input) {
		String replacedString = input.replaceAll("[^o]", "");
		int count = replacedString.length();
		System.out.println("Output of method1: " + count);
	}
//-----------------------------------------------------------------------	
	public static void method2(String input) {
		int count = 0;
		for(char c : input.toCharArray()) {
			if(c=='o') {
				count++;
			}
		}
	System.out.println("Output of method2: " + count);
	}
	
//-----------------------------------------------------------------------	

	public static void method3(String input) {
		Map<Character,Integer> occuranceMap = new HashMap<Character,Integer>();
		
		for(int i = 0; i<input.length(); i++) {
			occuranceMap.put(input.charAt(i), occuranceMap.getOrDefault(input.charAt(i), 0)+1);
		}
		
		System.out.println("Output of method3: " + occuranceMap.get('o'));
	}

//-----------------------------------------------------------------------	
	
	public static void main(String[] args) {
		String input = "You have no choice other than following me!";
		method1(input);
		method2(input);
		method3(input);
	}
	
}
