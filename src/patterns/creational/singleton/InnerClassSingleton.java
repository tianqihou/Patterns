package patterns.creational.singleton;

/**
 * 登记式/静态内部类
 */
public class InnerClassSingleton {

	private static class SingletonHolder {
		private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
	}

	private InnerClassSingleton() {
	};

	public static final InnerClassSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
