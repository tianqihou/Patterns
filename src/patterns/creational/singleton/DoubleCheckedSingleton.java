package patterns.creational.singleton;

/**
 * 双检锁
 */
public class DoubleCheckedSingleton {
	private volatile static DoubleCheckedSingleton singleton;

	private DoubleCheckedSingleton() {
	};

	public static DoubleCheckedSingleton getSingleton() {
		if (singleton == null) {
			synchronized (DoubleCheckedSingleton.class) {
				if (singleton == null) {
					singleton = new DoubleCheckedSingleton();
				}
			}
		}

		return singleton;
	}
}
