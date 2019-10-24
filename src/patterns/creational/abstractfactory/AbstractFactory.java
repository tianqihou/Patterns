package patterns.creational.abstractfactory;

import patterns.creational.abstractfactory.color.Color;
import patterns.creational.abstractfactory.shape.Shape;

public abstract class AbstractFactory {

	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
