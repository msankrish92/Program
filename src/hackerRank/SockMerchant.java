<<<<<<< HEAD
package hackerRank;

import java.util.HashMap;
import java.util.Map;
 
public class SockMerchant extends Triplets {
	
	public static int sockPairs(int ar[]) {
		int count = 0;
		Map<Integer, Integer> sockPair = new HashMap<Integer,Integer>();
		for(int i = 0; i<ar.length; i++) {
			sockPair.put(ar[i], sockPair.getOrDefault(ar[i], 0)+1);
		}
		System.out.println(sockPair);
		
		for(Map.Entry<Integer, Integer> value : sockPair.entrySet()) {
			System.out.println(value.getKey() + "=" + value.getValue());
			if(value.getValue()>1) {
				count = value.getValue()/2 + count;
			}
		}
		return count;
		
		
		
	}
	
	public  int findTriplets(int arr[], int r) {
		return r;
		
		
	}

	public static void main(String[] args) {
		int arr[] = {10,20,20,10,10,30,50,10,20};
	
		System.out.println(sockPairs(arr));
		
}
=======
package hackerRank;

import java.util.HashMap;
import java.util.Map;
 
public class SockMerchant extends Triplets {
	
	public static int sockPairs(int ar[]) {
		int count = 0;
		Map<Integer, Integer> sockPair = new HashMap<Integer,Integer>();
		for(int i = 0; i<ar.length; i++) {
			sockPair.put(ar[i], sockPair.getOrDefault(ar[i], 0)+1);
		}
		System.out.println(sockPair);
		
		for(Map.Entry<Integer, Integer> value : sockPair.entrySet()) {
			System.out.println(value.getKey() + "=" + value.getValue());
			if(value.getValue()>1) {
				count = value.getValue()/2 + count;
			}
		}
		return count;
		
		
		
	}
	
	public  int findTriplets(int arr[], int r) {
		return r;
		
		
	}

	public static void main(String[] args) {
		int arr[] = {10,20,20,10,10,30,50,10,20};
	
		System.out.println(sockPairs(arr));
		
}
>>>>>>> branch 'master' of https://github.com/msankrish92/Program.git
}