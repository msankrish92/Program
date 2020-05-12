package programs;

public class QuickSort {
	
	public static int partition(int arr[],int l, int r) {
		
		int high = arr[r];
		int i = l-1;
		for (int j = l; j < r; j++) {
			if(arr[j]<high) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		
		return i+1;
		
	}
	
	
	
	public static void sort(int arr[], int l, int r) {
		if(l<r) {
			int pi = partition(arr,l,r);
			sort(arr, l, pi-1);
			sort(arr, pi+1, r);
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {5,4,6,8,9,1,2};
		sort(arr, 0, arr.length-1);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
		
}
