package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class DynamicArray {

	public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
		List<List<Integer>> seqList = new ArrayList<List<Integer>>();

		for (int i = 0; i < n; i++) {
			seqList.add(new ArrayList<Integer>());
		}
		
		List<Integer> correctQueries = new ArrayList<Integer>();

		int lastAnswer = 0;

		for (List<Integer> q : queries) {
			int index = (q.get(1) ^ lastAnswer) % n;
			int y = q.get(2);
			switch (q.get(0)) {
			case 1:
				seqList.get(index).add(y);
				break;
			case 2:
				int size = seqList.get(index).size();
				lastAnswer = seqList.get(index).get(y%size);
				correctQueries.add(lastAnswer);
				break;
			}
		}
		return correctQueries;

	}

	public static void main(String[] args) {

	}

}
