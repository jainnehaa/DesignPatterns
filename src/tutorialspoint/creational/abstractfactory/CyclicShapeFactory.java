package tutorialspoint.creational.abstractfactory;

public class CyclicShapeFactory extends AbstractShapeFactory {
	public CyclicShapeFactory() {
		parameter = "radius";
	}

	@Override
	Shape getShape(String shapeType) {
		System.out.println(shapeType + " parameter : " + getParameter());

		if ("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		}
		if ("OVAL".equalsIgnoreCase(shapeType)) {
			return new Oval();
		}
		return null;
	}

}
