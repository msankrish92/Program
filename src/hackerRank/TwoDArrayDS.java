package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoDArrayDS {
	public static void main(String[] args) {
		int[][] arr =  {{1,1,1,0,0,0},
						{0,1,0,0,0,0},
						{1,1,1,0,0,0},
						{0,0,2,4,4,0},
						{0,0,0,2,0,0},
						{0,0,1,2,4,0}};
		int count = 0;
		int each = 0;
		List<Integer> totalCount = new ArrayList<>();
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = 0; j < arr.length-2; j++) {
				each = 0;
				for (int k = i; k < i+3; k++) {
					for (int l = j; l < j+3; l++) {
						if(k==i+1) {
							System.out.print(" "+arr[k][l+1]);
							each = arr[k][l+1] + each;
							break;
						}
						System.out.print(arr[k][l]);
						each = arr[k][l] + each;
					}
					System.out.println();
					
				}
				totalCount.add(each);
				System.out.println(count++);
			}
		}
		
		System.out.println(totalCount);
		Collections.sort(totalCount);
		int max = totalCount.get(totalCount.size()-1);
		System.out.println(max);
	}
	
	
}
