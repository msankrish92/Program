package programs.dailyChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
//	2. Write a java program to validate the given username is valid or not
//	Input: "Balaji_1"
//	output: false
//	Input: "Testleaf$123"
//	output: false
//	Note: 
//	1. It should contain minimum 8 characters.
//	2. It allows alpha numeric characters and spl characters like . _ @ $
	
	
	public static void main(String[] args) {
		String input1 = "Balaji_1";
		String input = "Testleaf$123";
		String regex = "[A-Za-z._@$]{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		Matcher matcher1 = pattern.matcher(input1);
		System.out.println(matcher.matches());
		System.out.println(matcher1.matches());
	}
}
