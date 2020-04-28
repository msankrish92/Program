package programs;

public class Palindrome  {

	public static String isPalindrome(String input) {
		if (input==null||input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length()-1) + isPalindrome(input.substring(0,input.length()-1));
	}
	
	
	 public static void main(String[] args) {
		String input = "TESTTSET";
		System.out.println(isPalindrome(input));
	}	
}
