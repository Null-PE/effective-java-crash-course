package week0;

public class NonStatic {

	public int primitiveTypeVariable = 0;

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
