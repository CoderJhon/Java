
public class Main 
{

	public static void main(String[] args) 
	{
		
		//overloaded constructors = 	multiple constuctors within a class with the same name,
		//								but have different parameters
		//								name + parameters = signature
		
		//Pizza pizza = new Pizza("Thick crust","tomato","mozzeralla","pepperoni");
		//Pizza pizza = new Pizza("Thick crust","tomato","mozzeralla");
		//Pizza pizza = new Pizza("Thick crust","tomato");
		//Pizza pizza = new Pizza("Thick crust");
		Pizza pizza = new Pizza();
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}

}
