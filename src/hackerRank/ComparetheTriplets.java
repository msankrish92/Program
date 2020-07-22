package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class ComparetheTriplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> output = new ArrayList<Integer>();
		int aliceCount = 0;
		int bobCount = 0;
		for (int i = 0; i < a.size(); i++) {
			
			if(a.get(i)<b.get(i)) {
				aliceCount++;
			}else if(a.get(i)>b.get(i)) {
				bobCount++;
			}
		}
		
		
		output.add(bobCount);
		output.add(aliceCount);
		return output;

    }
	
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(17);
		list1.add(28);
		list1.add(30);
		
		list2.add(99);
		list2.add(16);
		list2.add(8);
		System.out.println(compareTriplets(list1,list2));
		
	}
	
	
}
