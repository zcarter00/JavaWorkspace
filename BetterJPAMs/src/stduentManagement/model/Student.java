package stduentManagement.model;

public class Student 
{
	boolean isCurrentStudent;
	int gradeLevel;
	int idNumber;
	String name;
	String gender;
	int age;
	double gpa;
	
	public Student()
	{
		isCurrentStudent = false;
		gradeLevel = 0;
		idNumber = 0;
		name = "";
		gender = "";
		age = 0;
		gpa = 0.0;
	}
	
	public String toString()
	{
		String str = "";
		return str;
	}
	
}
