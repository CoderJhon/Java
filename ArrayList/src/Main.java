import java.util.ArrayList;
public class Main 
{

	public static void main(String[] args) 
	{
		//you need to use the wrapper class
		ArrayList <String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//this will replace whatever is in the position of 0
		food.set(0, "sushi");
		
		//this will remove whatever is in the position of 2
		food.remove(2);
		
		//this will clear everything in the array
		//food.clear();
		
		//for strings you need to use size not length
		for(int i = 0; i < food.size(); i++)
		{
			System.out.println(food.get(i));
		}
		
	}

}
