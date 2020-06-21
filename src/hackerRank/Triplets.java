<<<<<<< HEAD
package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Triplets {
	
		public static int findTriplets(int arr[], int r) {
			
			Map<Integer,Integer> leftMap = new HashMap<Integer,Integer>();
			Map<Integer,Integer> rightMap = new HashMap<Integer,Integer>();
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				rightMap.put(arr[i], rightMap.getOrDefault(arr[i], 0)+1);
			}
			
			for (int i = 0; i < arr.length; i++) {
				
				int value = arr[i];
				rightMap.put(value, rightMap.getOrDefault(value, 0)-1);
				int c1 = 0, c2 = 0;
				if(leftMap.containsKey(arr[i]/r)&&arr[i]/r>0) {
					c1 = leftMap.get(arr[i]/r);
				}
				if(rightMap.containsKey(arr[i]*r)) {
					c2 = rightMap.get(arr[i]*r);
				}
				
				count  = (c1*c2) + count;
			
				leftMap.put(arr[i], leftMap.getOrDefault(arr[i], 0)+1);
				for(Map.Entry<Integer, Integer> a : leftMap.entrySet()) {
					System.out.println(a.getKey());
				}
				
			}
			
			return count;
			
		}
	
		

		public static void main(String[] args) {
			int arr[] = {1,2,2,4};
			System.out.println(findTriplets(arr, 2));
		}
		
}
=======
package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Triplets {
	
		public static int findTriplets(int arr[], int r) {
			
			Map<Integer,Integer> leftMap = new HashMap<Integer,Integer>();
			Map<Integer,Integer> rightMap = new HashMap<Integer,Integer>();
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				rightMap.put(arr[i], rightMap.getOrDefault(arr[i], 0)+1);
			}
			
			for (int i = 0; i < arr.length; i++) {
				
				int value = arr[i];
				rightMap.put(value, rightMap.getOrDefault(value, 0)-1);
				int c1 = 0, c2 = 0;
				if(leftMap.containsKey(arr[i]/r)&&arr[i]/r>0) {
					c1 = leftMap.get(arr[i]/r);
				}
				if(rightMap.containsKey(arr[i]*r)) {
					c2 = rightMap.get(arr[i]*r);
				}
				
				count  = (c1*c2) + count;
			
				leftMap.put(arr[i], leftMap.getOrDefault(arr[i], 0)+1);
				for(Map.Entry<Integer, Integer> a : leftMap.entrySet()) {
					System.out.println(a.getKey());
				}
				
			}
			
			return count;
			
		}
	
		

		public static void main(String[] args) {
			int arr[] = {1,2,2,4};
			System.out.println(findTriplets(arr, 2));
		}
		
}
>>>>>>> branch 'master' of https://github.com/msankrish92/Program.git
