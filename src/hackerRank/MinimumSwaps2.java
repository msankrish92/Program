package hackerRank;

public class MinimumSwaps2 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,2,4,6,7};
		int count = 0;
		for(int i = arr.length-1; i>0; i--) {
			int largest = 0;
			for(int j = 1; j<=i; j++) {
				if(arr[j]>arr[largest]) {
					largest = j;
				}
			}
			if(arr[largest] != arr[i]) {
				int temp = arr[largest];
				arr[largest] = arr[i];
				arr[i] = temp;
				count++;	
			}
			
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(count);
		
	}
	
	
}
