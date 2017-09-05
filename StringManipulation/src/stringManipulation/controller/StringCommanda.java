package stringManipulation.controller;

import java.util.Scanner;

public class StringCommanda 
{
	Scanner myScanner = new Scanner(System.in);
	
	public StringCommanda()
	{
		
	}
	
	public void pointless()
	{
		System.out.println("Enter your name here fam: ");
		String reply = myScanner.nextLine();
		if(reply.equalsIgnoreCase("Fam"))
		{
		System.out.println("Sup fam");
		}
		else
		{
			System.out.println("yo bro who are u");
		}
	}
}
