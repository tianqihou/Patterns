package patterns.creational.prototype.shape;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	public void draw() {
		System.out.println("Square");
	}

}
