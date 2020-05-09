package programs;

public class Fibonacci {
	
	public static int findFibonacci(int input) {
		
		if(input == 0||input ==1) {
			return input;
		}
		
		return findFibonacci(input-1) + findFibonacci(input-2);
		
	}
	
	
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(findFibonacci(i));
		}
	}
}
