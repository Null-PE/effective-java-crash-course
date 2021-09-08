package week0;

public class Static {

	public static int primitiveTypeVariable = 1;

	public static String referenceTypeVariable = new String("default");

	public static void printStatus() {
		System.out.println("Static1 [referenceTypeVariable=" + referenceTypeVariable + ", primitiveTypeVariable="
				+ primitiveTypeVariable);
	}
}
