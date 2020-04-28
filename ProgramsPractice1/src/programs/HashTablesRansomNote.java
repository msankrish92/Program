package programs;

import java.util.HashSet;

public class HashTablesRansomNote {
	
	
	public static void method(String input1[], String[] input2) {
		HashSet<String> set1 = new HashSet<String>();
		
		for (int i = 0; i < input1.length; i++) {
			set1.add(input1[i]);
		}
		
		System.out.println(set1);
		int count = 0;
		for(int i = 0; i < input2.length; i++) {
			if(set1.contains(input2[i])) {
				count = count + 1;
			}
		}
		
		if(count == input2.length) {
			System.out.println("matched");
		}
	}
	
	
	public static void main(String[] args) {
		String[] input1 = {"two", "times", "three", "is", "not", "four"};
		String[] input2 = {"two", "times", "two", "is" ,"four"};
		method(input1, input2);
	}
	

}
