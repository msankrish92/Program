package learnGenerics;

import java.util.ArrayList;

public class Team<T extends Player> {

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	private ArrayList<T> members = new ArrayList<>();
	
	public Team(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " is alread on the team");
			return false;
		}else {
			members.add(player);
			System.out.println(player.getName() + " picked for the team" + this.name);
			return true;
		}
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void matchResult(Team opponent, int ourScore, int theirScore) {
		
		String message = new String();
		if(ourScore>theirScore) {
			won++;
			message = " beat ";
		}else if(ourScore==theirScore) {
			tied++;
			message ="drew with";
		}else {
			lost++;
		}
		played++;
		if(opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore, ourScore);
			
		}
		
	}
	
	public int ranking() {
		return (won*2) + tied;
	}
	
}
