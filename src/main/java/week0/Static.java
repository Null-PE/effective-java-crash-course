package week0;

public class Static {

	// プリミティブ型 他にはshort, long, float, double, boolean, and char.
	public static int primitiveTypeVariable = 1;

	// 参照型 プリミティブ型以外の型
	public static String referenceTypeVariable = new String("default");

	public static void printStatus() {
		System.out.println("Static1 [referenceTypeVariable=" + referenceTypeVariable + ", primitiveTypeVariable="
				+ primitiveTypeVariable);
	}
}
