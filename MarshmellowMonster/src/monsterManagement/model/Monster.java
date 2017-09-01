package monsterManagement.model;

public class Monster 
{
	private double legs;
	private int eyes;
	private String name;
	private boolean buttons;
	private int arms;
	
	public Monster()
	{
		legs = 0.0;
		eyes = 0;
		name = "";
		buttons = false;
		arms = 0;
	}
	
	public Monster(double legs, int eyes, String name, boolean buttons, int arms)
	{
		this.legs = legs;
		this.eyes = eyes;
		this.name = name;
		this.buttons = buttons;
		this.arms = arms;
	}
	
	public String toString()
	{
		String str = "This monster isn't alive..";
		if(name != "")
		{
			str = "This monster's name is " + name + " and he has " + arms + " arms and " + legs + " legs. He watches you with his " + eyes + " eyes.";
			if(buttons)
			{
				str = str + " He looks fashionable with his colorful buttons.";
			}
			else
			{
				str = str + " He is a boring piece of scum with no buttons.";
			}
		}
		return str;
	}
}
