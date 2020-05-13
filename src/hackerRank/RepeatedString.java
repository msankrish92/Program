package hackerRank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RepeatedString {

	public static void main(String[] args) {
	
		String input = "aba";
		long n = 10;
		
		long A=0,B=0;
		long p = n/input.length();
		long r = n%input.length();
		
		for (int i = 0; i < input.length(); i++) {
			if(r>i) {
				if((input.charAt(i) ^ 'a') == 0) {
					A++;
					B++;
				}
			}else	{
				if((input.charAt(i) ^ 'a') == 0) {
					A++;
					
			}
			
			}
				
		}
		System.out.println(A*p+B);
		
	}
}
