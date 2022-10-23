package tutorialspoint.creational.abstractfactory;

public abstract class AbstractShapeFactory {
	
	protected String parameter;
	
	abstract Shape getShape(String shapeType);

	public String getParameter() {
		return parameter;
	}
	
}
