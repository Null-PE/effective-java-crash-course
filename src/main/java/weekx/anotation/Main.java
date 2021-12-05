package weekx.anotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {

		Method[] methods = Sample.class.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(MyAnotation.class)) {
				String[] params = method.getAnnotation(MyAnotation.class).value();
				try {
					method.invoke(null, params[0], params[1]);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}

			}

			if (method.isAnnotationPresent(MyAnotationContainer.class)) {
				MyAnotation[] myAnotations = method.getAnnotationsByType(MyAnotation.class);
				for (MyAnotation myAnotation : myAnotations) {
					String[] params = myAnotation.value();
					System.out.println(params[0]);
					System.out.println(params[1]);
				}
			}
		}

	}

}
