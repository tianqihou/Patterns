package patterns.creational.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		SingletonObject object = SingletonObject.getInstance();
		object.foo();
		System.out.println(object == SingletonObject.getInstance());
		EnumSingleton.INSTANCE.whateverMethod();
	}
}
