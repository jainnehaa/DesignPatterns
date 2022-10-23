package tutorialspoint.creational.factory;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}
		if("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		}
		if("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
}
