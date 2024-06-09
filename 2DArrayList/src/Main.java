import java.util.*;
public class Main 
{

	public static void main(String[] args) 
	{
		
		//this 2D arraylist contains all the arraylist below 
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
	
		ArrayList<String> produceList = new ArrayList();
		
		produceList.add("tomatoes");
		produceList.add("carrots");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		
		drinksList.add("soda");
		drinksList.add("coffee");
		
		//this is addding all the arrays to the grocerylist array
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinksList);
		
		//this is getting the information from the array and the index
		System.out.println(groceryList.get(2).get(1));
	}

}
