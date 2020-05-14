package programs.dailyChallenges;

public class SumOfGivenNumbers {

	
	
//	. Write a java code to find the sum of the given numbers
//	Input: "asdf1qwer9as8d7"
//	output: 1+9+8+7 = 25


	
	public static void method1(String input) {
		String replacedString = input.replaceAll("[\\D]", "");
		int count = 0;
		char[] charArray = replacedString.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			count = count + Character.getNumericValue(charArray[i]);
		}
		System.out.println("Output of method1: " + count);
	}
	
	public static void method2(String input) {
		char[] ch = input.toCharArray();
		int count = 0;
		for(char a : ch) {
			if(Character.isDigit(a)) {
				count = count + Character.getNumericValue(a);
			}
		}
		System.out.println("Output of method2: " + count);
	}
	
	
	public static void main(String[] args) {
		String input = "asdf1qwer9as8d7";
		method1(input);
		method2(input);
	}
}
