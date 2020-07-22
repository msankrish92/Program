package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {

		int leftToRight = 0;
		for (int i = 0; i < arr.size(); i++) {
			leftToRight = arr.get(i).get(i) + leftToRight;
		}
		
		
		
		int rightToleft = 0;
		int decrementor = arr.size()-1;
		for (int i = 0; i < arr.size(); i++) {
			rightToleft = arr.get(i).get(decrementor--) + rightToleft;
		}
		
		return Math.abs(rightToleft-leftToRight);
	}

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		list2.add(4);
		list2.add(5);
		list2.add(6);

		list3.add(9);
		list3.add(8);
		list3.add(9);

		arr.add(list1);
		arr.add(list2);
		arr.add(list3);
		
		System.out.println(diagonalDifference(arr));
//		System.out.println(arr);

	}
}
