package dailyChallege;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {
//	1. Write a java program to print the duplicate character using Collections Framework.
//	Input: "When life gives you lemons, make lemonade"

	public static void method1(String input) {

		Set<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (!charSet.add(input.charAt(i))) {
				System.out.print(input.charAt(i));
			}

		}
	}
	
//---------------------------------------------------------------------//
	
	public static void method2(String input) {
		
	}
	
	
	

	public static void main(String[] args) {
		String input = "When life gives you lemons, make lemonade";
		method1(input);

	}
}
