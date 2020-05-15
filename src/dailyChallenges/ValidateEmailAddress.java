package programs.dailyChallenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailAddress {
	
//	1. Write a java program to verify whether the given String is valid email address.
//	Input: "balaji.chandrasekaran@testleaf.com"
//	output: true
//	Input: "balaji.c@tunatap.co.uk"
//	output: true
//	Input: "naveen e@tl.com"
//	output: false
//	Note: Spl characters like . _ are only allowed

//	String.valueOf(charAt()) ---> to convert char to string
//	(int) st.charAt(i) > 45
	
	public static void main(String[] args) {
		String input = "balaji.chandrasekaran@testleaf.com";
		String input2 = "naveen e@tl.com";
		String regex = "[A-Za-z0-9._]+@[A-Za-z0-9]+.[A-Za-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		Matcher matcher2 = pattern.matcher(input2);
		System.out.println(matcher.matches());
		System.out.println(matcher2.matches());
		
	}
}
