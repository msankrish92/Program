package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Triplets {

	/*
	 * public static Long triplets(List<Integer> arr, int r) { Map<Long, Long>
	 * potential = new HashMap<>(); Map<Long, Long> counter = new HashMap<>(); long
	 * count = 0; for (int i = 0; i < arr.size(); i++) { long a = arr.get(i); long
	 * key = a / r;
	 * 
	 * if (counter.containsKey(key) && a % r == 0) { count += counter.get(key); }
	 * 
	 * if (potential.containsKey(key) && a % r == 0) { long c = potential.get(key);
	 * counter.put(a, counter.getOrDefault(a, 0L) + c); }
	 * 
	 * potential.put(a, potential.getOrDefault(a, 0L) + 1); // Every number can be
	 * the start of a triplet. } return count;
	 *		}
	*/
	public static void main(String[] args) {
		Map<Integer,String> arr = new HashMap<Integer, String>();
		arr.put(0, "Krishnan");
		arr.put(1, "sanjay");
		boolean containsKey = arr.containsKey(1);
		System.out.println(arr.getOrDefault(2, "M"));
		System.out.println(containsKey);
		System.out.println(arr.get(1));
	}

}
