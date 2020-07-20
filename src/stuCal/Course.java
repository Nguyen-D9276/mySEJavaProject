package stuCal;

import java.util.Scanner;

public class Course extends Data
{
	private int difficulty;
	private double hoursRequired;
	private int studentRatings;
	private String description;
	private String instructor;
	private double averageGrade;
	
	public int getDifficulty()
	{
		return difficulty;
	}
	public void setDifficulty(int difficulty)
	{
		this.difficulty = difficulty;
	}
	public double getHoursRequired()
	{
		return hoursRequired;
	}
	public void setHoursRequired(double hoursRequired)
	{
		this.hoursRequired = hoursRequired;
	}
	public int getStudentRatings()
	{
		return studentRatings;
	}
	public void setStudentRatings(int studentRatings)
	{
		this.studentRatings = studentRatings;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getInstructor()
	{
		return instructor;
	}
	public void setInstructor(String instructor)
	{
		this.instructor = instructor;
	}
	public double getAverageGrade()
	{
		return averageGrade;
	}
	public void setAverageGrade(double averageGrade)
	{
		this.averageGrade = averageGrade;
	}
	
	
	public void changeInstructor()
	{
		System.out.println("Enter new instructor name");
		Scanner getInput = new Scanner(System.in);
		setInstructor(getInput.nextLine());
		getInput.close();
	}
	
	
}
