package patterns.creational.prototype;

import patterns.creational.prototype.shape.Shape;

public class PrototypeDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = ShapeCache.getShape("1");
		System.out.print(clonedShape.getId());
		System.out.println(clonedShape.getType());

		clonedShape = ShapeCache.getShape("2");
		System.out.print(clonedShape.getId());
		System.out.println(clonedShape.getType());

		clonedShape = ShapeCache.getShape("3");
		System.out.print(clonedShape.getId());
		System.out.println(clonedShape.getType());
	}
}
