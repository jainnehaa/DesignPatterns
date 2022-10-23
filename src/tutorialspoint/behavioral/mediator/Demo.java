package tutorialspoint.behavioral.mediator;

public class Demo {
	
	//Sort of Group Chat
	public static void main(String[] args) {
		User alice = new User("alice");
		User bob = new User("bob");
		User foo = new User("foo");
		User robert = new User("robert");
		User john = new User("john");
		
		alice.sendMessage("Hi Bob");
		robert.sendMessage("Hi Alice");
		john.sendMessage("Hi bob and robert");
	}
}
