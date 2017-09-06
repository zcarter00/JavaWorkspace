package stringManipulation.controller;

import java.util.Scanner;

public class StringCommanda 
{
	Scanner myScanner = new Scanner(System.in);
	
	public StringCommanda()
	{
		
	}
	//.equals checks if same as "  "; .endswith checks if a string ends with "   "
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
			System.out.println("yo homi who are u");
		}
	}
	//.substring(0,3); pulls out first 3, 0-1-2, ends before last letter(3)
	public String orToOur(String word)
	{
		String result = "";
		if(word.endsWith("or"))
		{
			word = word.substring(0,word.length()-2);
			word = word.concat("our");
			result = word;
			
			//result = word.substring(0,word.length()-2).concat("our");
		}
		else
		{
			result = word;
		}
		return result;
	}
}
