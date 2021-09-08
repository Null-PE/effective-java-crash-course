package week0;

public class Experiment1_5 {

	public static void main(String[] args) throws ClassNotFoundException {

		long primitive = 1;
		method1(primitive);
		System.out.println(primitive);

		NonStatic reference = new NonStatic();
		method2(reference);
		System.out.println(reference);

		method3(reference);
		System.out.println(reference);

	}

	public static void method1(long val) {
		val = 2;
	}

	public static void method2(NonStatic nonStatic) {
		nonStatic.primitiveTypeVariable = 2;
		nonStatic.referenceTypeVariable = new String("method2");
	}

	public static void method3(NonStatic nonStatic) {
		nonStatic = new NonStatic();
		nonStatic.primitiveTypeVariable = 3;
		nonStatic.referenceTypeVariable = new String("method3");
	}

}
