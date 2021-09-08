package week0;

public class NonStatic {

	// プリミティブ型 他にはshort, long, float, double, boolean, and char.
	public int primitiveTypeVariable = 0;

	// 参照型　プリミティブ型以外の型
	public String referenceTypeVariable = new String("default");

	public String method1() {
		System.out.println("nonStaticMethod called");
		return null;
	}

	@Override
	public String toString() {
		return "NonStatic [referenceTypeVariable=" + referenceTypeVariable + ", primitiveTypeVariable="
				+ primitiveTypeVariable + "]";
	}

}
