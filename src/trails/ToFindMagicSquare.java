package trails;

public class ToFindMagicSquare {

	public static void main(String[] args) {

		int[][] s = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };

		for(int i = 0; i<s.length; i++) {
			int rowSum = 0;
			int colSum = 0;
			for(int j = 0; j<s[i].length; j++) {
				rowSum += s[i][j];
				colSum += s[j][i];
			}
			
			if(rowSum != 15) return;
			if(colSum != 15) return;
			
			
		}
		System.out.println(true);
		
	}

}
