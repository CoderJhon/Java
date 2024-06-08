import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		
		//nested loop = a loop inside of a loop
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		//asking the user for number of rows
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		
		//asking the user for the number of columns 
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		//asking which symbol to make the graphic
		System.out.println("Enter a symbol to use: ");
		symbol = scanner.next();
		
		//the NESTED LOOP
		//This loop will make the row and then go throught the second loop before going again
		for(int i = 1; i <= rows; i++) 
		{
			System.out.println();
			//This loop will make the columns 
			for(int j = 1; j <= columns; j++)
			{
				System.out.print(symbol);
			}
		}
		
	}

}
