
public class Main 
{

	public static void main(String[] args) 
	{
		
		// static = modifer. A single copy of a variable/ method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Mason");
		Friend friend2 = new Friend("Nick");
		Friend friend3 = new Friend("Dylan");
		Friend friend4 = new Friend("Aidan");
		
		Friend.displayFriends();
		
		
	}

}
