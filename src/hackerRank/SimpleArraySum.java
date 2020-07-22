package hackerRank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleArraySum {

	
	  static int simpleArraySum(int[] ar) {
	        
//		  int sum = Arrays.stream(ar).sum();
		 int sum = Arrays.stream(ar).flatMap(IntStream::of).sum();
		  return sum;
		  

	    }
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		simpleArraySum(arr);
	}
	
	
}
