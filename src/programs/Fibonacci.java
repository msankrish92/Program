<<<<<<< HEAD
package programs;

public class Fibonacci {
	
	public static int method1(int input) {
		
		if(input == 0 || input ==1) {
			return input;
		}else {
			return method1(input-1) + method1(input-2);
		}
	}
	
	public static void method2(int input) {
		System.out.println();
		int a = 0; int b = 1; int c = 0;
		System.out.print("0" + " " + "1" + " ");
		for (int i = 0; i < input; i++) {
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(method1(i) + " ");
		}
		method2(10);
	}
}
=======
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
>>>>>>> branch 'master' of https://github.com/msankrish92/Program.git
