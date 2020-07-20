package stuCal;

import java.util.Scanner;

public class Data
{
	protected String name;
	
	public static String[] getInfo()
	{
		//used to gather all data in DB
		//not yet implemented
		String[] result = {"CSIS 3275", "Alex", "Simon"};
		return result;
	}
	
	public void updateInfo()
	{
		System.out.println("Enter new name");
		Scanner getInput = new Scanner(System.in);
		name = getInput.nextLine(); 
		getInput.close();
	}
}
