package tutorialspoint.creational.abstractfactory;

public class QuadilateralShapeFactory extends AbstractShapeFactory{
	
	public QuadilateralShapeFactory() {
		parameter = "diagonal";
	}

	@Override
	Shape getShape(String shapeType) {
		System.out.println(shapeType + " parameter : "+ getParameter());
		
		if("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		}
		if("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}
		return null;
	}
	
}
