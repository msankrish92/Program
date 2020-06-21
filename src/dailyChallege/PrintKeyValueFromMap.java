package dailyChallege;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintKeyValueFromMap {
	// PROGRAM:
		/* Write a Java Program to print the keys and values from the Map 
		 * map = {A=1, B=2, C=3, D=4, E=5} 
		 * (Min 3 ways) 
		 * Note: Even if you google understand what you are doing! 
		 * output: 
		 * A->1 
		 * B->2
		 * C->3 
		 * D->4 
		 * E->5
		 */
	 // How to update Value inside a map in a newer way instead of using .put method.
	 // How to update Value inside a map in a newer way using .put method.
	public static void main(String[] args) {
		Map<String,Integer> sampleMap = new LinkedHashMap<String,Integer>();
		sampleMap.put("A", 1);
		sampleMap.put("B", 2);
		sampleMap.put("C", 3);
		sampleMap.put("D", 4);
		sampleMap.put("E", 5);
		
		//First way
		System.out.println(sampleMap);
		
		//Second way		
		for(Map.Entry<String, Integer> a : sampleMap.entrySet()) {
			System.out.print("{"+a.getKey() + "=" + a.getValue()+"}");
		}
		
		//Third way
		sampleMap.forEach((eachKey,eachValue)-> System.out.println(eachKey+" = "+eachValue));
		
		
		
	}
	

	
}
