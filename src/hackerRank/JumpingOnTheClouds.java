package hackerRank;

public class JumpingOnTheClouds {

	public static void main(String[] args) {
		int c[] = { 0,0,1,0,0,1,0 };
		int j = 0;
		int jumpCount = 0;
//		while (j < arr.length) {
//			if (arr[j+1] == 0) {
//				j = j+1;
//				jumpCount = jumpCount + 1;
//				if (j <arr.length) {
//					if (arr[j+1] == 0) {
//						j = j+1;
//					}
//				}
//			} else if(arr[j+1] == 1){
//				if (arr[j+2] == 0) {
//					jumpCount = jumpCount + 1;
//					j = j + 2;
//				}
//			}
//		}
		
		for (int i = 0; i < c.length-1; i++) {
			if(j<c.length-1) {
				if (c[j+1] == 0) {
					j = j+1;
					jumpCount = jumpCount + 1;
					if (j+1 <c.length) {
						if (c[j+1] == 0) {
							j = j+1;
						} Ye
					}
				} else if(c[j+1] == 1){
					if (c[j+2] == 0) {
						jumpCount = jumpCount + 1;
						j = j + 2;
					}
				}
				
			}
		}
		
		
		System.out.println(jumpCount);
	}
}