
public class Main 
{

	public static void main(String[] args) 
	{
		//these are local variables 
		int x = 3;
		int y = 4;
		
		int z = add(x,y);
		
		//System.out.println(add(x,y));
		System.out.println(z);
	}

	static int add(int x, int y)
	{
		int z = x + y;
		return z;
		
		//return x+y;
	}
}
