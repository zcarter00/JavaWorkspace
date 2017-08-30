package stduentManagement.model;

public class Student 
{
	private boolean isCurrentStudent;
	private int gradeLevel;
	private int idNumber;
	private String name;
	private String gender;
	private int age;
	private double gpa;
	
	public Student() 
	{
		//this is constructor method; is name of class, initiates instance variables.
		isCurrentStudent = false;
		gradeLevel = 0;
		idNumber = 0;
		name = "";
		gender = "";
		age = 0;
		gpa = 0.0;
	}
	/**
	 * 
	 * @param isCurrentStudent
	 * @param gradeLevel
	 * @param idNumber
	 * @param name
	 * @param gender
	 * @param age
	 * @param gpa
	 */
	public Student(boolean isCurrentStudent, int gradeLevel, int idNumber, String name, String gender, int age, double gpa)
	{
		//this is an overloaded constructor
		this.isCurrentStudent = isCurrentStudent;
		this.gradeLevel = gradeLevel;
		this.idNumber = idNumber;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.gpa = gpa;
	}
	
	public String toString()
	{
		String str = "This person is not a current student.";
		if(isCurrentStudent)
		{
			str = "Name: " + name + ", Sex: " + gender + ", Age: " + age + ", ID: " + idNumber + ", Grade Level: " + gradeLevel + ", GPA: " + gpa;
		}
		return str;
		//this is an override
		
	}
	
}
