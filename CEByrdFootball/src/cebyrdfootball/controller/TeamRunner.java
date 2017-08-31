package cebyrdfootball.controller;

import cebyrdfootball.model.*;

public class TeamRunner
{

	public static void main(String[] args) 
	{
		Team myTeam = new Team("Yellow Jackets", 423987.342, 1, true);
		System.out.println(myTeam);
		
		Team myTeamTwo = new Team("Panthers", -11.35, 2, false);
		System.out.println(myTeamTwo);
	}

}
