package programs.dailyChallenges;

public class Palindrome {

//	2. Check for the palindrome of the given string:
//	Input: "malayalam"
//	output: Yes, Palindrome
//	Input: "testleaf"
//	output: No, not a palindrome

	public static void method1(String input) {

		char c[] = input.toCharArray();
		char a[] = new char[c.length];
		int j = 0;
		for (int i = c.length - 1; i >= 0; i--) {
			a[j] = c[i];
			j++;
		}

		String output = new String(a);

		System.out.println(input.equals(output) ? "It is a palindrome" : "Not a palindrome");
	}

//-------------------------------------------------------------//

	public static void method2(String input) {
		StringBuilder str = new StringBuilder(input);
		StringBuilder reversestr = str.reverse();
		String output = reversestr.toString();

		System.out.println(input.equals(output) ? "It is a palindrome" : "Not a palindrome");

	}

//-------------------------------------------------------------//

	public static String method3(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + method3(input.substring(0, input.length() - 1));
	}

//-------------------------------------------------------------//	

	public static void main(String[] args) {
		String input = "malayalam";
		method1(input);
		method2(input);
		String output = method3(input);
		System.out.println(input.equals(output) ? "It is a palindrome" : "Not a palindrome");
	}

}
