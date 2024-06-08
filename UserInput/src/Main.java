//This is the import you need to use the scanner
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		//this is how to get the scanner
		Scanner scanner = new Scanner(System.in);
		
		//this will print the question for the user 
		System.out.println("What is your name? ");
		//this will allow the user to type their answer and store it in the name variable
		String name = scanner.nextLine();
		
		//this will print the question for the user 
		System.out.println("How old are you? ");
		//this will allow the user to type their answer and store it in the age variable but it only allows ints nothing else
		int age = scanner.nextInt();
		//this will clear the scanner if it fails
		scanner.nextLine();
		
		//this will print the question for the user 
		System.out.println("What is your favorite food? ");
		//this will allow the user to type their answer and store it in the food variable
		String food = scanner.nextLine();
		
		
		//this will print out the variables that store the information that the user sent in
		System.out.println("Hello " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("You favorite food is " + food);
	}
}
