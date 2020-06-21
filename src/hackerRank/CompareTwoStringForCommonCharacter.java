<<<<<<< HEAD
package hackerRank;

import java.util.Scanner;

public class CompareTwoStringForCommonCharacter {

	/**
	 * Given two strings, determine if they share a common substring. A substring
	 * may be as small as one character. For example, the words "a", "and", "art"
	 * share the common substring . The words "be" and "cat" do not share a
	 * substring. Sample input hello world hi world Sample Output YES NO
	 * 
	 **/

	public static void main(String[] args) {

		String input1 = "sanjay";
		String input2 = "Krishnan";
		boolean flag = false;
		for(char a : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
			
			if(input1.indexOf(a)>-1 && input2.indexOf(a)>-1) {
				flag = true;
			}
		}
		
		System.out.println(flag);
}
=======
package hackerRank;

import java.util.Scanner;

public class CompareTwoStringForCommonCharacter {

	/**
	 * Given two strings, determine if they share a common substring. A substring
	 * may be as small as one character. For example, the words "a", "and", "art"
	 * share the common substring . The words "be" and "cat" do not share a
	 * substring. Sample input hello world hi world Sample Output YES NO
	 * 
	 **/

	public static void main(String[] args) {

		String input1 = "sanjay";
		String input2 = "Krishnan";
		boolean flag = false;
		for(char a : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
			
			if(input1.indexOf(a)>-1 && input2.indexOf(a)>-1) {
				flag = true;
			}
		}
		
		System.out.println(flag);
}
>>>>>>> branch 'master' of https://github.com/msankrish92/Program.git
}