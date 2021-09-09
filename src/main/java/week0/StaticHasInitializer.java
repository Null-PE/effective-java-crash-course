package week0;

public class StaticHasInitializer {

	// static initializer1
	static {
		System.out.println("static initializer1 called");
		printStatus();
	}

	public static int csp = 0;

	public static String csr = new String("default");

	// static initializer2
	static {
		System.out.println("static initializer2 called");
		csp = 1;
		csr = new String("changed1");
		printStatus();
	}

	public static void printStatus() {
		System.out.println("StaticHasInitializer [csr=" + csr + ", csp="
				+ csp);
		System.out.println();
	}
}
