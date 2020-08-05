package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.security.auth.kerberos.KerberosKey;

public class FormingaMagicSquare {

	static int minCost = Integer.MAX_VALUE;
	static int formingMagicSquare(int[][] s) {
		int[] digitsArr = {1,2,3,4,5,6,7,8,9};
		int[][] targetSquare = {{0,0,0},{0,0,0},{0,0,0}};
		dfs(digitsArr,0,targetSquare,s);
		return minCost;
	}
	
	private static void dfs(int[] digitArr, int currentIndex, int[][] targetSquare, int[][] s) {
		if(currentIndex > digitArr.length) return;
		if(currentIndex == digitArr.length) {
			int index = 0;
			int currentCost = 0;
			for (int i = 0; i < targetSquare.length; i++) {
				for (int j = 0; j < targetSquare[i].length; j++) {
					targetSquare[i][j] = digitArr[index++];
					currentCost = Math.abs(targetSquare[i][j] - s[i][j]);
				}
			}
			if(isMagicSquare(targetSquare, 15)) {
				minCost = Math.min(currentCost, minCost);
			} 
			return;
		}
		
		for (int i = currentIndex; i < digitArr.length; i++) {
			int temp = digitArr[i];
			digitArr[i] = digitArr[currentIndex];
			digitArr[currentIndex] = temp;
			dfs(digitArr,currentIndex+1,targetSquare,s);
			temp = digitArr[i];
			digitArr[i] = digitArr[currentIndex];
			digitArr[currentIndex] = temp;
		}
		
	}
	
	static boolean isMagicSquare(int[][] s, int targetSum) {
		for(int i = 0; i<s.length; i++) {
			int rowSum = 0;
			int colSum = 0;
			for(int j = 0; j<s[i].length; j++) {
				rowSum += s[i][j];
				colSum += s[j][i];
			}
			
			if(rowSum != targetSum) return false;
			if(colSum != targetSum) return false;
		}
			int leftDiagSum = 0;
			int i = 0, j = 0;
			while(i<s.length && j < s[i].length) {
				leftDiagSum += s[i][j];
				i++;
				j++;
			}
			if(leftDiagSum != targetSum) return false;
			
			int rightDiagSum = 0;
			i = 0;
			j = s[i].length - 1;
			while(i<s.length && j>=0) {
				rightDiagSum += s[i][j];
				i++;
				j--;
			}
			
			if(rightDiagSum!=targetSum) return false;
			return true;
		
	}
	

	public static void main(String[] args) {
		int arr[][] = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 5 } };
//		System.out.println(Integer.MAX_VALUE);
		System.out.println(formingMagicSquare(arr));

	}

}
