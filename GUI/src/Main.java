//this will import JOptionPane which will let you use a GUI
import javax.swing.JOptionPane;

public class Main 
{

	public static void main(String[] args) 
	{
		//this will bring up a gui that asks for a name and only takes strings
		String name = JOptionPane.showInputDialog("Enter your name");
		//this will display the response on a different GUI
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		//A JOption returns Strings but if you are inputting an int you need to use Integer.parseInt();
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); 
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		//A JOption returns Strings but if you are inputting a double you need to use Double.parseDouble();		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height")); 
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
		
	}

}
