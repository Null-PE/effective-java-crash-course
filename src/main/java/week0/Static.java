package week0;

public class Static {

	public static int csp = 1;

	public static String csr = new String("default");

	public static void printStatus() {
		System.out.println("Static1 [referenceTypeVariable=" + csr + ", primitiveTypeVariable="
				+ csp);
	}
}
