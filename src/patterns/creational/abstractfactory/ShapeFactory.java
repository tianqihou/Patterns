package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.color.Color;
import patterns.creational.abstractfactory.shape.Circle;
import patterns.creational.abstractfactory.shape.Rectangle;
import patterns.creational.abstractfactory.shape.Shape;
import patterns.creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
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

	@Override
	Color getColor(String color) {
		return null;
	}
}
