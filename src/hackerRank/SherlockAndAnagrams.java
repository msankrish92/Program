package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockAndAnagrams {

	public static void main(String[] args) {
		String input = "abcd";
		List<String> arr = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i; j < input.length(); j++) {
				arr.add(input.substring(i, j + 1));
			}
		}

//		String check = arr.get(1);
//		StringBuilder sb = new StringBuilder();
//		sb.reverse();
//		System.out.println(sb.toString());

//		char[] temp = check.toCharArray();
//		Arrays.sort(temp);
//		
//		check = new String(temp);

//		System.out.println(check);
		System.out.println(arr);
		System.out.println(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			char[] temp = arr.get(i).toCharArray();
			Arrays.sort(temp);

			String check = new String(temp);
			arr.set(i, check);

		}
		System.out.println(arr);

		int count = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i; j < arr.size() - 1; j++) {
//				char[] temp = arr.get(j + 1).toCharArray();
//				Arrays.sort(temp);
//				String check = new String(temp);
				if (arr.get(i).equals(arr.get(j + 1))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
