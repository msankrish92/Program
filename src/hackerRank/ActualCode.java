package hackerRank;

import java.util.*;

public class ActualCode {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player1[] player = new Player1[n];
		Checker2 checker = new Checker2();

		for (int i = 0; i < n; i++) {
			player[i] = new Player1(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player, checker);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}

}

class Player1 {
	String name;
	int score;

	Player1(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker2 implements Comparator<Player1> {
	// complete this method
	public int compare(Player1 a, Player1 b) {
//		if(a.score == b.score) {
//			
//		}
		if(a.score>b.score) {
			return -1;
		}
		if(a.score<b.score) {
			return +1;
		}
		return a.name.compareTo(b.name);
		
	}

}
