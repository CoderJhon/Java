import java.util.ArrayList;
public class Main 
{

	public static void main(String[] args)
	{

		//for-each = traversing technique to iterate throught the elements in an array/collection
		//			 less steps, more readable
		//			 less flexible
		
		//This is for an array
		//String[] animals = {"cat", "dog", "rat","bird"};
		
		
		//This is an ArrayList
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("rat");
		animals.add("bird");
		
		
		//nothing changes just showing how it is used for both
		for(String i : animals)
		{
			System.out.println(i);
		}
		
	}

}
