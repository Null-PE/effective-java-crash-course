package week0;

public class StaticHasInitializer {

	// static initializer1
	static {
		System.out.println("static initializer1 called");
		printStatus();
	}

	public static int csp = 1;

	public static String csr = new String("default");

	// static initializer2
	static {
		System.out.println("static initializer2 called");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("Static1 [referenceTypeVariable=" + csr + ", primitiveTypeVariable="
				+ csp);
		System.out.println();
	}
}
