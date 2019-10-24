package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.color.Blue;
import patterns.creational.abstractfactory.color.Color;
import patterns.creational.abstractfactory.color.Green;
import patterns.creational.abstractfactory.color.Red;
import patterns.creational.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if ("red".equalsIgnoreCase(color)) {
			return new Red();
		} else if ("green".equalsIgnoreCase(color)) {
			return new Green();
		} else if ("blue".equalsIgnoreCase(color)) {
			return new Blue();
		}

		return null;
	}
}
