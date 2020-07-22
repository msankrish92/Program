package hackerRank;

public class PlusMinus {

    static void plusMinus(int[] arr) {

    	double positiveNumber = 0;
    	double negativeNumber = 0;
    	double zeros = 0;
    	for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				positiveNumber++;
			}else if(arr[i]<0) {
				negativeNumber++;
			}else {
				zeros++;
			}
		}
    	System.out.println(String.format("%.5f", positiveNumber/arr.length));
    	System.out.println(String.format("%.5f",negativeNumber/arr.length));
    	System.out.println(String.format("%.5f",zeros/arr.length));

    }
	
    
    public static void main(String[] args) {
		int arr[] = {-4,3,-9,0,4,1};
		plusMinus(arr);
	}
	
	
}
