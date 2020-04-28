package hackerRank;

public class AlternatingCharacters {

	/**
	 * You are given a string containing characters A and B only. Your task is to
	 * change it into a string such that there are no matching adjacent characters.
	 * To do this, you are allowed to delete zero or more characters in the string.
	 * 
	 * Your task is to find the minimum number of required deletions. sample Inputs
	 * 5 AAAA BBBBB ABABABAB BABABA AAABBB Sample Outputs 3 4 0 0 4
	 */
	public static void main(String[] args) {
		String s = "BBBAAA";

		char[] ch = s.toCharArray();
		int deletion = 0;
		char si = 'A';

		if (ch[0] == 'A' || ch[0] == 'B') {
			if (ch[0] == 'A')
				si = 'B';
			if (ch[0] == 'B')
				si = 'A';
			for (int j = 1; j < ch.length; j++) {
				if (ch[j] == si) {
					if (si == 'A') {
						si = 'B';
					} else {
						si = 'A';
					}

				} else {
					deletion = deletion + 1;
				}
			}
		}
		System.out.println(deletion);
	}

}
