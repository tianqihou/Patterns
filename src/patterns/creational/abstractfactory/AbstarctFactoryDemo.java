package patterns.creational.abstractfactory;

public class AbstarctFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		shapeFactory.getShape("rectangle").draw();
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		colorFactory.getColor("red").fill();
	}

}
