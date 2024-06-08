
public class Main 
{

	public static void main(String[] args) 
	{
		//declaring 
		int x; 
		
		//assignment
		x = 123; 
		
		//initialization
		int y = 123;
		
		//for a long variable you need to follow it with an L
		long z = 123456789123456789L;
		
		//for floats you need to add an f at the end
		float a = 3.14f;
		
		//will be used more commonly because you do not need to add the f at the end and it can hold more
		double b = 3.1415;
		// can only hold true or false
		boolean c = true;
		//this will display whatever single character is in the single quotes
		char symbol = '@';
		//a string needs to have a capital S 
		String name = "Jhon";
		//printing x 
		System.out.println(x);
		
		//this will print out words with the variable number 
		System.out.println("My number is: " + x);
		
		//this will print out a long number and it doesn't show the L 
		System.out.println("This is a long number: " + z);
		// this will print out a float with out the f
		System.out.println("This is a float: " + a);
		//this will print out a double
		System.out.println("This is a double: " + b);
		//this will print out the char
		System.out.println(symbol);
		//this will print out the string
		System.out.println("Hello " + name);
	}

}
