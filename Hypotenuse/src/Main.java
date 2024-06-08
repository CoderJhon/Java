import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{

		double x;
		double y;
		double z;
		
		//calls in the scanner
		Scanner scanner = new Scanner(System.in);
		
		//asking user for x
		System.out.println("Enter side x: ");
		//this will save the response in x
		x = scanner.nextDouble();
		
		//asking user for y
		System.out.println("Enter side y: ");
		//this will save the response in y
		y = scanner.nextDouble();
		
		//this is using the pythagorean theorem to solve the math equation
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
		//this closes out the scanner
		scanner.close();
		
	}

}
