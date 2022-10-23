package tutorialspoint.creational.abstractfactory;

public class FactoryProducer {
	
	public static AbstractShapeFactory getFactory(String factoryType) {
		switch(factoryType) {
			case "CYCLIC" : return new CyclicShapeFactory(); 
			case "QUADILATERAL" : return new QuadilateralShapeFactory(); 
			default : return new DefaultShapeFactory();
		}
	}

	public static AbstractShapeFactory getFactory() {
		return getFactory("");
	}
	
}
