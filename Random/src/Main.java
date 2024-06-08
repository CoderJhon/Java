
import java.util.Random;

public class Main 
{

	public static void main(String[] args) 
	{
		
		//not true random but pseudo random
		Random random = new Random();
		
		//the int will choose a number from 0-5 so you need to add 1 to make it 1-6
		//int x = random.nextInt(6) + 1;
		//the double is from 0-1 
		//double y = random.nextDouble();
		//boolean is true or false 
		boolean z = random.nextBoolean();
		
		System.out.println(z);
		
	}

}
