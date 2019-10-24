package patterns.creational.singleton;

public class SingletonObject {

	private static SingletonObject instance = new SingletonObject();

	private SingletonObject() {
	};

	public static SingletonObject getInstance() {
		// 懒汉式，不加锁线程不安全，加锁效率低。如需懒加载，可采用登记式
		// if (instance == null) {
		// instance = new SingletonObject();
		// }
		return instance;
	}

	public void foo() {
		System.out.println("...");
	}
}
