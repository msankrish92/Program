package hackerRank;

import java.util.Scanner;

public class CompareTwoStringForCommonCharacter {

	/**
	 * Given two strings, determine if they share a common substring. A substring
	 * may be as small as one character. For example, the words "a", "and", "art"
	 * share the common substring . The words "be" and "cat" do not share a
	 * substring. 
	 * Sample input hello world hi world 
	 * Sample Output YES NO
	 * 
	 **/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalIteration = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < totalIteration; i++) {
			String firstWord = sc.next();
			String secondWord = sc.next();
//			char[] arr1 = firstWord.toCharArray();
//			char[] arr2 = secondWord.toCharArray();
//			for (int j = 0; j < arr1.length; j++) {
//				for (int k = 0; k < arr2.length; k++) {
//					if(arr1[j] == arr2[k]) {
//						flag = true;
//					}
//				}
//			}
			
			for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray())
			{
		        if(firstWord.indexOf(c) > -1 && secondWord.indexOf(c) > -1)
		        flag = true;
		    }

		}if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
	
	
	
}
