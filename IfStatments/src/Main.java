
public class Main 
{

	public static void main(String[] args) 
	{
		
		//if statement = performs a block of code if its condition evaluates to be true
		
		int age = 18;
		
		//you need to put them in order or the program will stop on the first one that matches even if another one matches better
		if(age >= 75) 
		{
			System.out.println("Ok boomer");
		}
		else if(age >= 18) 
		{
			System.out.println("You are an adult");
		}
		else if(age >= 13) 
		{
			System.out.println("You are a teenager");
		}
		else
		{
			System.out.println("You are not an adult");
		}
		
	}

}
