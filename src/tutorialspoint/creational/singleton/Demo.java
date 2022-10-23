package tutorialspoint.creational.singleton;

public class Demo {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.showMessage();
	}
}
