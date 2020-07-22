package hackerRank;

import java.util.Arrays;

public class ArrayLeftRotation {

	
	
	
	
	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5};
		int d = 2;
		
		for (int i = 0; i < d; i++) {
			int temp = a[0];
			for (int j = 1; j < a.length; j++) {
				a[j-1] = a[j];
			}
			a[a.length-1] = temp;
		}
		
		for(int b : a) {
			System.out.println(b);
		}
		
	}
	
}
