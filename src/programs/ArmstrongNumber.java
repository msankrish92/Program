package programs;

public class ArmstrongNumber {
	
	public static int recursiveMethod(int input, int count) {
		if(input>0) {
			int remainder = input%10;
			input = input/10;
			count = (remainder*remainder*remainder) + count;
			return recursiveMethod(input, count);
//			System.out.println("out one step back");	
			
		}
		
		return count;
	}

	
	public static void main(String[] args) {
		int input = 153;
		int copyOfInput = input;
		int remainder = 0;
		int count = 0;
		int count1 = 0;
		while(copyOfInput!=0) {
			remainder = copyOfInput%10;
			copyOfInput = copyOfInput/10;
			
			count = (remainder*remainder*remainder) + count;
		}
		System.out.println(count);
		System.out.println(recursiveMethod(input, count1));
	}
	
}
