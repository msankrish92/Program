package hackerRank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RepeatedString {

	public static void main(String[] args) {
		
//		String arr[] = {"a","b","a"};
//		
		Long length = 1000000000000L;
//		
//		int j = 0;
//		
//		Long arr2[] = new Long[length];
//		
//		for (int i = 0; i < length; i++) {
//			
//			if(j>=arr.length) {
//				j = 0;
//			}
//			arr2[i] = arr[j];
//			j++;
//		}
//		
//		int count = 0;
//		for (int i = 0; i < arr2.length; i++) {
//			if(arr2[i] == "a") {
//				count += 1;
//			}
//		}
//		System.out.println(count);
//		
		
	String input = "aba";	
	char[] charArray = input.toCharArray();
	
	List<Character> asList = new LinkedList<Character>();
	int j = 0;
	for (int i = 0; i < length; i++) {
		if(j>=charArray.length) {
			j = 0;
		}
		asList.add(charArray[j]);
		System.out.println(asList.get(i));
		j++;
	}
	Long count = 0L;
	for (int i = 0; i < asList.size(); i++) {
		if(asList.get(i)=='a') {
			count += 1;
		}
	}
	System.out.println(count);
	}
	
	
	



}
