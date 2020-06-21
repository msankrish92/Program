<<<<<<< HEAD
package programs;

public class ArmstrongNumber {

	public static void method1(int input) {
		int count = 0;
		while (input % 10 > 0) {
			int remainder = input % 10;
			count = count + (remainder * remainder * remainder);
//			System.out.println(input/10);
			input = input / 10;

		}
		System.out.println(count);
	}
	
	public static void method2(int input) {
		int count = 0;
		int remainder = 0;
		for (; input % 10 > 0; input = input / 10) {
			remainder = input % 10;
			count = count + (remainder * remainder * remainder);
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		method1(153);
		method2(153);
	}
}
=======
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
>>>>>>> branch 'master' of https://github.com/msankrish92/Program.git
