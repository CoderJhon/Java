
public class Main 
{

	public static void main(String[] args) 
	{

		//method = a block of code that is executed whenever it is called upon
		
		String name = "Jhon";
		int age = 22;
		
		hello(name, age);
		
		
	}

	static void hello(String title, Integer age) 
	{
		
		System.out.println("Hello" + title);
		System.out.println("You are " + age + " years old");
	
	}
	
}
