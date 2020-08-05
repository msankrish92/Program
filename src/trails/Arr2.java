package trails;

public class Arr2 {
	
	
	public static int[] swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	static int min = Integer.MAX_VALUE;
	public static void permute(int[] arr,int[][] input, int l, int r) {
		if(l == r) {
			int[][] arrFrom = {{0,0,0},{0,0,0},{0,0,0}};
			int index = 0;
			for (int i = 0; i < arrFrom.length; i++) {
				for (int j = 0; j < arrFrom.length; j++) {
					arrFrom[i][j] = arr[index++];
				}
			
			int count = 0;
			if(isMagicSquare(arrFrom, 15)) {
				for (int j = 0; j < arrFrom.length; j++) {
					
					for (int k = 0; k < arrFrom.length; k++) {
						count = Math.abs(input[j][k] - arrFrom[j][k]) + count;
					}
					
				}
				if(count<min) {
					min = count;
//					System.out.println(min);
				}
			}
			}
//			System.out.println();
//			int[] matchArray = {8,1,6,3,5,7,4,9,21};
//			boolean areEqual = areEqual(arr, matchArray);
//				if(areEqual) {
//					System.out.println("matched");
//				}
//			
		}
		
		for (int i = l; i < arr.length; i++) {
			arr = swap(arr,l,i);
			permute(arr,input, l+1, r);
			arr = swap(arr,l,i);
		}
		
		
	}
	
//	 public static boolean areEqual(int arr1[], int arr2[]) 
//	    { 
//	        int n = arr1.length; 
//	        int m = arr2.length; 
//	  
//	        // If lengths of array are not equal means 
//	        // array are not equal 
//	        if (n != m) 
//	            return false; 
//	  
//	        // Sort both arrays 
////	        Arrays.sort(arr1); 
////	        Arrays.sort(arr2); 
//	  
//	        // Linearly compare elements 
//	        for (int i = 0; i < n; i++) 
//	            if (arr1[i] != arr2[i]) 
//	                return false; 
//	  
//	        // If all elements were same. 
//	        return true; 
//	    } 
	 
	 static boolean isMagicSquare(int[][] s, int targetSum) {
			for(int i = 0; i<s.length; i++) {
				int rowSum = 0;
				int colSum = 0;
				for(int j = 0; j<s[i].length; j++) {
					rowSum += s[i][j];
					colSum += s[j][i];
				}
				
				if(rowSum != targetSum) return false;
				if(colSum != targetSum) return false;
			}
				int leftDiagSum = 0;
				int i = 0, j = 0;
				while(i<s.length && j < s[i].length) {
					leftDiagSum += s[i][j];
					i++;
					j++;
				}
				if(leftDiagSum != targetSum) return false;
				
				int rightDiagSum = 0;
				i = 0;
				j = s[i].length - 1;
				while(i<s.length && j>=0) {
					rightDiagSum += s[i][j];
					i++;
					j--;
				}
				
				if(rightDiagSum!=targetSum) return false;
				return true;
			
	
	 }

	public static void main(String[] args) {

		int[] arr = { 1,2,3,4,5,6,7,8,9 };
		int input[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 5 } };
		permute(arr,input, 0, arr.length-1);
		System.out.println(min);
		
		

		}

}
