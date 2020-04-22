package hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pairs {
	  static int pairs(int k, int[] arr) {
		  int sum =0;
		    Set<Integer> set = new HashSet<Integer>();
		    for(int n=0; n< arr.length; n++){
		        set.add(arr[n]);
		    }
		    for(int n=0; n< arr.length; n++){
		        if(set.contains(arr[n]+k)){
		            sum+=1;
		        }
		    }
		    return sum;	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] nk = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nk[0]);

	        int k = Integer.parseInt(nk[1]);

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        int result = pairs(k, arr);
	        
	        System.out.println(result);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedWriter.close();

	        scanner.close();
	    }
	}


