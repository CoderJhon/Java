
public class Main 
{

	public static void main(String[] args) 
	{
		
		//constuctor = special method that is called when an object is instantiated (created)
		
		Human human1 = new Human("Jhon", 22, 210);
		Human human2 = new Human("Sofia", 9, 90);
		
		//System.out.println(human1.name);
		//System.out.println(human2.name);
		
		human2.eat();
		human1.drink();
	}

}
