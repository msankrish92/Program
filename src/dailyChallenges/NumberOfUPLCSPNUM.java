package programs.dailyChallenges;

public class NumberOfUPLCSPNUM {
//	3. Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
//	Input: "1. It is Work from Home  not Work for Home"
	
	public static void method1(String input) {
		
		int noOfDigits = 0;
		int noOfUpperCases = 0;
		int noOfLowerCases = 0;
		int noOfSpaces = 0;
		for(char c : input.toCharArray()){
			if(Character.isDigit(c)) {
				noOfDigits++;
			}
			if(Character.isLowerCase(c)) {
				noOfLowerCases++;
			}
			if(Character.isUpperCase(c)) {
				noOfUpperCases++;
			}
			if(Character.isWhitespace(c)) {
				noOfSpaces++;
			}
			
		}
		
		System.out.println("No of Digits: " + noOfDigits);
		System.out.println("No of LowerCase: " + noOfLowerCases);
		System.out.println("No of UpperCase: " + noOfUpperCases);
		System.out.println("No of Whitespace: " + noOfSpaces);
	}
//------------------------------------------------------------------------------------------------------//	
	public static void method2(String input) {
		
		String upperCase = input.replaceAll("[^\\[A-Z\\]]", "");
		int lowerCaseCount = input.replaceAll("[^\\[a-z\\]]", "").length();
		int spaceCount = input.replaceAll("[^\\s]", "").length();
		int digitCount = input.replaceAll("[\\D]", "").length();
		int upperCaseCount = upperCase.length();
		System.out.println("No of Digits: " + digitCount);
		System.out.println("No of LowerCase: " + lowerCaseCount);
		System.out.println("No of UpperCase: " + upperCaseCount);
		System.out.println("No of Whitespace: " + spaceCount);
		
	}
	
//------------------------------------------------------------------------------------------------------//	
	
	public static void method3(String input) {
		char[] ch = input.toCharArray();
		int noOfDigits = 0;
		int noOfUpperCases = 0;
		int noOfLowerCases = 0;
		int noOfSpaces = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {
				noOfLowerCases++;
			}
			else if(ch[i] >= 'A' && ch[i] <= 'Z') {
				noOfUpperCases++;
			}
			else if(ch[i] >= '0' && ch[i] <= '9') {
				noOfDigits++;
			}else if(ch[i] == ' ') {
				noOfSpaces++;
			}
		}
		System.out.println("No of Digits: " + noOfDigits);
		System.out.println("No of LowerCase: " + noOfLowerCases);
		System.out.println("No of UpperCase: " + noOfUpperCases);
		System.out.println("No of Whitespace: " + noOfSpaces);
	}
	
	
	public static void main(String[] args) {
		String input = "1. It is Work from Home  not Work for Home";
		method1(input);
		System.out.println("--------------------------------");
		method2(input);
		System.out.println("--------------------------------");
		method3(input);
	}
}
