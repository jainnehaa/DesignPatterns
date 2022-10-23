package tutorialspoint.creational.abstractfactory;

public class DefaultShapeFactory extends AbstractShapeFactory {

	@Override
	Shape getShape(String shapeType) {
		return new Polygon();
	}
	
}
