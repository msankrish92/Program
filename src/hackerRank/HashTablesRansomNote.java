<<<<<<< HEAD
package hackerRank;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HashTablesRansomNote {

	public static void method(String input1[], String[] input2) {
		Map<String, Integer> input1Map = new TreeMap<String, Integer>();
		Map<String, Integer> input2Map = new TreeMap<String, Integer>();

		for (int i = 0; i < input1.length; i++) {
			input1Map.put(input1[i], input1Map.getOrDefault(input1[i], 0) + 1);
		}

		for (int i = 0; i < input2.length; i++) {
			input2Map.put(input2[i], input2Map.getOrDefault(input2[i], 0) + 1);
		}

		System.out.println(input1Map);
		System.out.println(input2Map);

		for (int i = 0; i < input1.length; i++) {
//			System.out.println(input1[i]);
			if (!input2Map.containsKey(input1[i])) {
				input1Map.remove(input1[i]);
			}
		}

		System.out.println(input1Map);

		ArrayList<Integer> input1List = new ArrayList<Integer>();

		for (Integer a : input1Map.values()) {
			input1List.add(a);
		}
		ArrayList<Integer> input2List = new ArrayList<Integer>();

		for (Integer a : input2Map.values()) {
			input2List.add(a);
		}

		System.out.println(input1List);
		System.out.println(input2List);
		boolean flag = false;
		for (int i = 0; i < input2List.size(); i++) {
			if(input1List.get(i)<input2List.get(i)||input1List.size()!=input2List.size()) {
				
				flag = false;
				break;
			}
			flag = true;
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

	public static void main(String[] args) {
		String[] input1 = {"ive","got","a","lovely","bunch","of","coconuts" };
		String[] input2 = { "ive","got","some","coconuts" };
		method(input1, input2);
	}

}
=======
package hackerRank;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HashTablesRansomNote {

	public static void method(String input1[], String[] input2) {
		Map<String, Integer> input1Map = new TreeMap<String, Integer>();
		Map<String, Integer> input2Map = new TreeMap<String, Integer>();

		for (int i = 0; i < input1.length; i++) {
			input1Map.put(input1[i], input1Map.getOrDefault(input1[i], 0) + 1);
		}

		for (int i = 0; i < input2.length; i++) {
			input2Map.put(input2[i], input2Map.getOrDefault(input2[i], 0) + 1);
		}

		System.out.println(input1Map);
		System.out.println(input2Map);

		for (int i = 0; i < input1.length; i++) {
//			System.out.println(input1[i]);
			if (!input2Map.containsKey(input1[i])) {
				input1Map.remove(input1[i]);
			}
		}

		System.out.println(input1Map);

		ArrayList<Integer> input1List = new ArrayList<Integer>();

		for (Integer a : input1Map.values()) {
			input1List.add(a);
		}
		ArrayList<Integer> input2List = new ArrayList<Integer>();

		for (Integer a : input2Map.values()) {
			input2List.add(a);
		}

		System.out.println(input1List);
		System.out.println(input2List);
		boolean flag = false;
		for (int i = 0; i < input2List.size(); i++) {
			if(input1List.get(i)<input2List.get(i)||input1List.size()!=input2List.size()) {
				
				flag = false;
				break;
			}
			flag = true;
		}
		
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

	public static void main(String[] args) {
		String[] input1 = {"ive","got","a","lovely","bunch","of","coconuts" };
		String[] input2 = { "ive","got","some","coconuts" };
		method(input1, input2);
	}

}
>>>>>>> branch 'master' of https://github.com/msankrish92/Program.git
