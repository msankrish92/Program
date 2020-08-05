package dailyChallenges;

import java.util.ArrayList;
import java.util.List;

public class AllSubSet {

//	public static void main(String[] args) {
//		List<List<Integer>> result = new ArrayList<>();
//		result.add(new ArrayList<Integer>());
//		int[] nums = {1,2,3};
//		for(int x : nums) {
//			int n = result.size();
//			for (int i = 0; i < n; i++) {
//				ArrayList<Integer> r = new ArrayList<Integer>(result.get(i));
//				r.add(x);
//				result.add(r);
//			}
//		}
//		System.out.println(result);
//	}

	// Java program to generate power set

	// str : Stores input string
	// curr : Stores current subset
	// index : Index in current subset, curr
	static void powerSet(String str, int index, String curr) {
		int n = str.length();
//
//		// base case
////		if (index == n) {
////			return;
////		}

		// First print current subset
		System.out.println(curr);

		// Try appending remaining characters
		// to current subset
		for (int i = index + 1; i < n; i++) {
			curr += str.charAt(i);
			powerSet(str, i, curr);

			// Once all subsets beginning with
			// initial "curr" are printed, remove
			// last character to consider a different
			// prefix of subsets.
			curr = curr.substring(0, curr.length() - 1);
		}
	}

	// Driver code
	public static void main(String[] args) {
		String str = "abc";
		int index = -1;
		String curr = "";
		powerSet(str, index, curr);
	}
}

// This code is contributed by PrinciRaj1992
