package no.arcticdrakefox.wolfbot.roles;

import no.arcticdrakefox.wolfbot.management.PlayerList;

public class OldMan extends Villager {

	private int ttl;
	
	public OldMan(String name, int numWolves) {
		super(name);
		this.ttl = numWolves + 1;
	}

	@Override
	public String nightAction(String message, PlayerList players) {
		return "You do not have any night actions. You should probably be resting up, old man.";
	}
	
	@Override
	public String nightStart() {
		ttl--;
		return null;
	}
	
	@Override
	public String nightEnd() {
		if (ttl == 0)
		{
			die (String.format("%s died in the night, but not by the hand of a wolf.", getName()));
			return "It looks like your time in this world is up. As the last breath escapes your tired body, you think you hear a low growling...";
		}
		
		return null;
	}
}
