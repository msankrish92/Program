package hackerRank;

import java.util.Arrays;

public class SparseArrays {

	public static void main(String[] args) {

		String[] strings = { "aba", "baba", "aba", "xzxb" };
		String[] queries = { "aba", "xzxb", "ab" };

		int[] output = new int[queries.length];

		for (int i = 0; i < queries.length; i++) {

			String query = queries[i];
			int count2 = (int) Arrays.stream(strings).filter(a -> a.equals(query)).count();
			output[i] = count2;

		}

	}

}
