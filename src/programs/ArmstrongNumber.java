package programs;

public class ArmstrongNumber {
	
	public static int armstrongNumber(int input, int count) {
		if(input > 0) {
			int remainder = input % 10;
			input = input/10;
			count = (remainder * remainder * remainder) + count;
			return armstrongNumber(input, count);
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int input = 153;
		System.out.println(armstrongNumber(input, 0));
	}
		
}
