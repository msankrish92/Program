package hackerRank;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class NewYearChallenge {

	public static void main(String[] args) {
	
//		int[] input = {1,2,3,4,5};
		int[] q = {5,1,2,3,7,8,6,4};
		
		int[] input = new int[q.length];
		for(int i = 1; i <= input.length; i++){
		    input[i-1] = i;
		}
		int count = 0;
		for (int i = 0; i < q.length-1; i++) {
			if(input[i] == q[i]) {
//				break;
			}else if(q[i] == input[i+1]) {
				int temp = input[i+1];
				input[i+1] = input[i];
				input[i] = temp;
				count++;
			}else if(i+2<input.length) {
				if(q[i] == input[i+2]) {
					for (int j = 2; j >= 1; j--) {
						int temp = input[i+j];
						input[i+j] = input[i+j-1];
						input[i+j-1] = temp;
						count++;
					}
			}
		}
		}
//		
//		for (int i = 0; i < q.length; i++) {
//			System.out.print(q[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < q.length; i++) {
//			System.out.print(input[i]);
//		}
		
		if(Arrays.equals(q, input)) {
			System.out.println(count);
		}else {
			System.out.println("Too chaotic");
		}
			
//		System.out.println(equals);
		
	}
	
	}	
	
	

