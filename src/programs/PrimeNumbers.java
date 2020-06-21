<<<<<<< HEAD
package programs;

public class PrimeNumbers {
	
	public static boolean findPrimeNumber(int n) {
		
		int sqr = (int)Math.sqrt(n);
		
		for(int i = 2; i<=sqr; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " +findPrimeNumber(i));
		}
	}

}
=======
package programs;

public class PrimeNumbers {
	
	public static boolean findPrimeNumber(int n) {
		
		int sqr = (int)Math.sqrt(n);
		
		for(int i = 2; i<=sqr; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " +findPrimeNumber(i));
		}
	}

}
>>>>>>> branch 'master' of https://github.com/msankrish92/Program.git
