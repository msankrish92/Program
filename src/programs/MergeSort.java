package programs;

public class MergeSort {
	
	public static void merge(int arr[], int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			L[i] = arr[i+l]; 
		}
		for(int j = 0; j < n2; j++) {
			R[j] = arr[m+j+1];
		}
		
		int i = 0; int j = 0; int k = l;
		
		while(i<n1&&j<n2) {
			if(L[i]<R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	
	
	public static void sort(int arr[], int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(arr,l,m);
			System.out.println(l);
			System.out.println(m);
			sort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {5,9,8,2,1,4,3};
		sort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	}
