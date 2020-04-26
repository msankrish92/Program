package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Triplets {

	public static void findTriplets(int arr[], int r) {
		
		Map<Integer, Integer> leftMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> rightMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			rightMap.put(arr[i], rightMap.getOrDefault(arr[i], 0) + 1);
		}
//		int c1 = 0,c2 = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int c1 = 0,c2 = 0;
			int midterm = arr[i];
			System.out.println("MidTerm = " + midterm);
			rightMap.put(midterm, rightMap.getOrDefault(midterm, 0)-1);
			System.out.println(rightMap);
			System.out.println(leftMap);
			if(leftMap.containsKey(midterm/r) && midterm%r == 0) {
				c1 = leftMap.get(midterm/r);
			}
			if(rightMap.containsKey(midterm*r)) {
				c2 = rightMap.get(midterm * r);
			}
			count  = (c1*c2) + count;
			leftMap.put(midterm, leftMap.getOrDefault(midterm, 0) + 1);
		}
		System.out.println(count);
	}
	
	
	
	
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,4};
		int r = 2;
		findTriplets(arr, r);
	}

}
