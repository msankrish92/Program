package programs;

public class QuickSort {
	
	public static int partition(int arr[], int low, int high) {
		
		int pivot = arr[high];
		int  i = low-1;
		for(int j = low; j<arr.length; j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
		
	}
	
	
	public static void sort(int arr[], int l, int r) {
		if(l<r) {
			int pi = partition(arr, l, r);
			sort(arr, l, pi-1);
			sort(arr, pi+1, r);
			
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {9,5,1,2,4,3,6};
		sort(arr,0,arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
