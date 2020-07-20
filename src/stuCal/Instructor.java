package stuCal;

public class Instructor extends Data
{
	private String major;
	private String[] course;
	private String[] officeHours;
	private int rating;
	private String description;
	private String ID;
	private String password;
	
	
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	public String[] getCourse()
	{
		return course;
	}
	public void setCourse(String[] course)
	{
		this.course = course;
	}
	public String[] getOfficeHours()
	{
		return officeHours;
	}
	public void setOfficeHours(String[] officeHours)
	{
		this.officeHours = officeHours;
	}
	public int getRating()
	{
		return rating;
	}
	public void setRating(int rating)
	{
		this.rating = rating;
	}
	public String getDescription()
	{
		return description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
	public String getID()
	{
		return ID;
	}
	public void setID(String iD)
	{
		ID = iD;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String[] getInstructor()
	{
		String[] result = {name, major, course.toString(), officeHours.toString(), ""+rating, description};
		return result;
	}
}
