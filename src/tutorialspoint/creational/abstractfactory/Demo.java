package tutorialspoint.creational.abstractfactory;

public class Demo {
	public static void main(String[] args) {
		AbstractShapeFactory factory1 = FactoryProducer.getFactory("CYCLIC");
		Shape shape1 = factory1.getShape("Oval");
		shape1.draw();
		Shape shape2 = factory1.getShape("Circle");
		shape2.draw();
		System.out.println("----------------------");
		AbstractShapeFactory factory2 = FactoryProducer.getFactory("QUADILATERAL");
		Shape shape3 = factory2.getShape("Square");
		shape3.draw();
		System.out.println("----------------------");
		AbstractShapeFactory factory3 = FactoryProducer.getFactory();
		Shape shape4 = factory3.getShape("");
		shape4.draw();
	}
}
