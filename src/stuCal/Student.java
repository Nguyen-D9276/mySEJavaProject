package stuCal;

public class Student extends Data
{
	private String major;
	private String yearOfStudy;
	private String[] courses;
	private String[] availability;
	private String userID;
	private String password;
	
	public void GenerateStudyPlan()
	{
		//match this student's info with others from database to generate study plan
		//not yet implemented 
	}
	public String[] getStudent()
	{
		String[] stuInfo = {name, major, yearOfStudy, courses.toString(), availability.toString()};
		return stuInfo;
	}
	
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	public String getYearOfStudy()
	{
		return yearOfStudy;
	}
	public void setYearOfStudy(String yearOfStudy)
	{
		this.yearOfStudy = yearOfStudy;
	}
	public String[] getCourses()
	{
		return courses;
	}
	public void setCourses(String[] courses)
	{
		this.courses = courses;
	}
	public String[] getAvailability()
	{
		return availability;
	}
	public void setAvailability(String[] availability)
	{
		this.availability = availability;
	}
	public String getUserID()
	{
		return userID;
	}
	public void setUserID(String userID)
	{
		this.userID = userID;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
}
