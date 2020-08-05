package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClimbingtheLeaderboard {

	public static void main(String[] args) {
		Integer[] scores = {100,90,90,80,75,60};
//		Integer[] inputScore = { 100, 100, 50, 40, 40, 20, 10 };
		int[] alice = {50,65,77,90,102};
//		int[] aliceScore = { 5, 25, 50, 120 };

		// I need to loop through the inputScore to find the position where I need to
		// place the first score
		// value of aliceScore and print
		// Pick the second aliceScore and find the position to place it and remove the
		// previously place
		// and print the placed position

		// Create a Map with Rank and Score

		Map<Integer, Integer> rankScore = new LinkedHashMap<>();

		for (int i = 0; i < scores.length; i++) {
			rankScore.put(scores[i],
					rankScore.getOrDefault(scores[i], 0) + 1);
		}

		Arrays.stream(scores).map(a -> rankScore.put(a,
					rankScore.getOrDefault(a, 0) + 1)).collect(Collectors.toList());
		
//		rankScore.entrySet().stream().forEach((v) -> System.out.println(v.getKey() + "->" + v.getValue()));
//		List<Integer> outputList = new ArrayList<Integer>();
		int[] output = new int[scores.length];
		for (int i = 0; i < alice.length; i++) {
			int index = 1;	
			for(int a : rankScore.keySet()) {
				if(a>alice[i]) {
					index++;
				}
			}
			output[i] = index;
		}
		
		

	}

}
