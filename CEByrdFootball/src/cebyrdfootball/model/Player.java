package cebyrdfootball.model;

public class Player extends Team 
{
	private String name;
	private int num;
	private double height;
	private double weight;
	private boolean areUGud;


	public Player()
	{
		String name = "";
		int num = 0;
		double height = 0;
		double weight = 0;
		boolean areUGud = false;
	}

	public Player(String name, int num, double height, double weight, boolean areUGud)
	{
		this.name = name;
		this.num = num;
		this.height = height;
		this.weight = weight;
		this.areUGud = areUGud;
	}
}