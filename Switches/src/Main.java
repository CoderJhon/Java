
public class Main 
{

	public static void main(String[] args) 
	{
		
		// Switch = statement that allows a variable to be tested for equality against a list of values
		//alternative to using a ton of if statments
		
		String day = "Monday";
		
		switch(day)
		{
			case "Sunday": System.out.println("It is Sunday!");
			//you need the breaks or it will continue without checking the case
			break;
			
			case "Monday": System.out.println("It is Monday!");
			break;
			
			case "Tuesday": System.out.println("It is Tuesday!");
			break;
			
			case "Wednesday": System.out.println("It is Wednesday!");
			break;
			
			case "Thursday": System.out.println("It is Thursday!");
			break;
			
			case "Friday": System.out.println("It is Friday!");
			break;
			
			case "Saturday": System.out.println("It is Saturday!");
			break;
			
			default: System.out.println("That is not a day");
		}
		
		
		
	}

}
