package programs;

public class Programs {

	public static void bubbleSort(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
	}
	
	
	
	public static void main(String args[]) {
		
		int[] arr = {5,8,3,6,1,4,2,7,9};
		bubbleSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
		
}
