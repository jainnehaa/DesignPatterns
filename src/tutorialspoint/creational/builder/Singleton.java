package tutorialspoint.creational.builder;

public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Singleton class : showMessage method");
	}
}
