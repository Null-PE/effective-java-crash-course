package week0;

public class StaticHasInitializer {

	// static initializer1
	static {
		System.out.println("static initializer1 called");
		printStatus();
	}

	// プリミティブ型 他にはshort, long, float, double, boolean, and char.
	public static int primitiveTypeVariable = 1;

	// 参照型 プリミティブ型以外の型
	public static String referenceTypeVariable = new String("default");

	// static initializer2
	static {
		System.out.println("static initializer2 called");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("Static1 [referenceTypeVariable=" + referenceTypeVariable + ", primitiveTypeVariable="
				+ primitiveTypeVariable);
		System.out.println();
	}
}
