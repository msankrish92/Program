package programs;

public class ArmstrongNumber {
	
	public static int findArmStrongNumber(int input) {
		int remainder = 0;
//		int qotiant = 0;
		int count = 0;
		while(input>0) {
			remainder = input%10;
			input = input/10;
			count = (remainder*remainder*remainder)+count;
			
			findArmStrongNumber(input);		
			
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(findArmStrongNumber(153));
	}
}
