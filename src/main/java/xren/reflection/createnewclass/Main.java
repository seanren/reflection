package xren.reflection.createnewclass;

import java.lang.reflect.Constructor;

public class Main {

	public Main() {
		System.out.println("main.constructor");
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args)  {
		try {
			Class <TestClass> clazz = (Class<TestClass>) Class.forName("xren.reflection.createnewclass.TestClass");
			TestClass test = loadClass(clazz);
			test.setV1(10);
			System.out.println("TestClass output " + test.getV1());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public static <T> T loadClass(Class<T> clazz) {

		T instance = null;

		try {

			Constructor<T> constructor = clazz.getDeclaredConstructor(new Class[0]);
			instance = constructor.newInstance();
			return instance;

		} catch (Exception e) {
			throw new RuntimeException("Unable to create class " + clazz.getName());
		}

	}
	
	

}
