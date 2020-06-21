package learnGenerics;



public class Learn {

	public static void main(String[] args) {
		FootBallPlayer joe = new FootBallPlayer("joe");
		BaseBallPlayer pat = new BaseBallPlayer("pat");
		SoccerPlayer beckam = new SoccerPlayer("Beckam");
		FootBallPlayer gordan = new FootBallPlayer("Gordan");
		
		Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide crow");
		adelaideCrows.addPlayer(joe);
//		adelaideCrows.addPlayer(pat);
//		adelaideCrows.addPlayer(beckam);
		
		System.out.println(adelaideCrows.numPlayers());
	
		Team<BaseBallPlayer> baseBallTeam = new Team<>("Chicago club");
		baseBallTeam.addPlayer(pat);
		
		Team<SoccerPlayer> brokenTeam = new Team<>("This wont work");
		brokenTeam.addPlayer(beckam);
		
		Team<FootBallPlayer> melbourne = new Team<>("Melbourne");
		melbourne.addPlayer(gordan);
		
		Team<FootBallPlayer> hawthorn = new Team<>("Hawthorn");
		Team<FootBallPlayer> fremantle = new Team<>("Fremantle");
		hawthorn.matchResult(fremantle, 1, 0);
		hawthorn.matchResult(adelaideCrows, 3, 8);
		
		adelaideCrows.matchResult(fremantle, 2,1);
		adelaideCrows.matchResult(baseBallTeam, 1, 1);
		
	}

}
