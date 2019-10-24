package patterns.creational.factory;

import patterns.creational.factory.shape.Circle;
import patterns.creational.factory.shape.Rectangle;
import patterns.creational.factory.shape.Shape;
import patterns.creational.factory.shape.Square;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if ("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		}

		return null;
	}
}
