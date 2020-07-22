package hackerRank;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		int n = 5;
		int queries[][] = { { 1, 2, 100 },
							{ 2, 5, 100 }, 
							{ 3, 4, 100 } };
		long output[] = new long[n+2];
		for (int i = 0; i < queries.length; i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int k = queries[i][2];
			
			output[a] += k;
			output[b+1] -= k;
		}
		
		
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
		
		for (int i = 1; i < output.length; i++) {
			output[i] = output[i] + output[i - 1];
		}
		
		Arrays.sort(output);
		
		System.out.println( output[output.length-1]);
		
		System.out.println("+++++++++++++++++++++++++++++++++++==");
		
		
		
		
		
		
		
		
		
		
		
		
//		long[] arr = new long[n];
////		long largest = 0;
//		for (int i = 0; i < queries.length; i++) {
//			for (int j = queries[i][0]; j <= queries[i][1]; j++) {
//				for (int k = 0; k < j; k++) {
//					if (k + 1 == j) {
//						arr[k] = queries[i][2] + arr[k];
//						
//					}
//				}
//			}
//		}
//		Arrays.sort(arr);
////		for (int i = arr.length - 1; i > 0; i--) {
////			int largest = 0;
////			for (int j = 1; j <= i; j++) {
////				if (arr[j] > arr[largest]) {
////					largest = j;
////				}
////
////			}
////			long temp = arr[largest];
////			arr[largest] = arr[i];
////			arr[i] = temp;
////		}
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//
//		System.out.println(arr[arr.length - 1]);
//
	}

}
