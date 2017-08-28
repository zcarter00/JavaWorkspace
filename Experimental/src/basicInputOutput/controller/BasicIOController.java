package basicInputOutput.controller;
import java.util.Scanner;
public class BasicIOController 
{
	private String firstName = "";
	private String lastName = "";
	
	public BasicIOController(String first, String last) //constructor - method with same name as its class that initializes the class
	{
		firstName = first;
		lastName = last;
	}
	public void printGreeting() //parentheses always go after methods
	{
		System.out.println("How do you do, " + firstName + " " + lastName);
		Scanner myScanner = new Scanner(System.in);
		String response = myScanner.nextLine();
		System.out.println(response);
		myScanner.close();
	}
}
