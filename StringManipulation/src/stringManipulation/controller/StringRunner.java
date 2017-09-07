package stringManipulation.controller;

public class StringRunner 
{

	public static void main(String[] args) 
	{
		//StringCommanda myCommanda = new StringCommanda();
		//myCommanda.pointless();
		
		//System.out.println(myCommanda.orToOur("color"));
		//.out.println(myCommanda.orToOur("armor"));
		
		WordReverser myReverser = new WordReverser();
		System.out.println(myReverser.reverse("Racecar"));
	}

}
