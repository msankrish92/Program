package programs;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	public static void merge(List<Integer> list, int l, int m, int r) {
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		List<Integer> LL = new ArrayList<Integer>();
		List<Integer> RL = new ArrayList<Integer>();
		
		for(int i = 0; i < n1; i++) {
			LL.add(list.get(l+i));
			
		}
		System.out.println(LL);
		for(int j = 0; j < n2; j++) {
			RL.add(list.get(m+1+j));
		}
		System.out.println(RL);
		
		int i = 0, j = 0, k = l;
		
		while(i<n1&&j<n2) {
			if(LL.get(i)<RL.get(j)) {
				list.set(k, LL.get(i));
				i++;
			}else {
				list.set(k, RL.get(j));
				j++;
			}
			k++;
		}
		
		
		while(i<n1) {
			list.set(k, LL.get(i));
			i++;
			k++;
		}
		while(j<n2) {
			list.set(k, RL.get(j));
			j++;
			k++;
		}
		
		
		
	}

	
	
	
	public static void sort(List<Integer> list, int l, int r) {
		if(l<r) {
			int m = (l+r)/2;
			sort(list,l,m);
			sort(list,m+1,r);
			merge(list,l,m,r);
			
		}
	}
	
	
	
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(8);
		list.add(2);
		list.add(1);
		list.add(9);
		
		sort(list,0,list.size()-1);
		
		System.out.println(list);
	}
}
