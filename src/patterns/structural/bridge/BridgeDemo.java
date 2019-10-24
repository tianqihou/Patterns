package patterns.structural.bridge;

import patterns.structural.bridge.draw.GreenCircle;
import patterns.structural.bridge.draw.RedCircle;
import patterns.structural.bridge.shape.Circle;
import patterns.structural.bridge.shape.Shape;

public class BridgeDemo {
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}
}
