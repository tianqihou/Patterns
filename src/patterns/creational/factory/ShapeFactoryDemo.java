package patterns.creational.factory;

import patterns.creational.factory.shape.Shape;

public class ShapeFactoryDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape = shapeFactory.getShape("circle");
		shape.draw();
		shape = shapeFactory.getShape("rectangle");
		shape.draw();
		shape = shapeFactory.getShape("square");
		shape.draw();
	}

}
