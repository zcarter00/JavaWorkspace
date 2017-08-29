package studentManagement.controller;

import stduentManagement.model.*;

public class StudentRunner 
{
	public static void main(String[] args)
	{
		Student myStudent = new Student(true, 12, 645677, "Zach Carter", "Undefined", 17, 4.0);
		System.out.println(myStudent);
	}
}
