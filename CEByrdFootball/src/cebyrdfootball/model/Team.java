package cebyrdfootball.model;

public class Team 
{
	private String teamName;
	private double avgPPG;
	private int numPlayers;
	private boolean winningRecord;
	

	public Team()
	{
		teamName = "";
		avgPPG = 0.0;
		numPlayers = 0;
		winningRecord = false;
	}
	
	public Team(String teamName, double avgPPG, int numPlayers, boolean winningRecord)
	{
		this.teamName = teamName;
		this.avgPPG = avgPPG;
		this.numPlayers = numPlayers;
		this.winningRecord = winningRecord;
	}
	
	public String toString()
	{
		String str = "Team Doesn't Exist";
		if(teamName != "")
		{
			str = teamName + ", with " + numPlayers + "players scores " + avgPPG + " points per game.";
			if(winningRecord)
			{
				str = str + "They are winning this season.";
			}
			else
			{
				str = str + "They are losing this season.";
			}
		}
		
		return str;
	}
}