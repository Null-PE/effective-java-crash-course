package week0;

public class NonStatic {

	public int cp = 0;

	public String cr = new String("default");

	public String method1() {
		System.out.println("nonStaticMethod called");
		return null;
	}

	@Override
	public String toString() {
		return "NonStatic [referenceTypeVariable=" + cr + ", primitiveTypeVariable="
				+ cp + "]";
	}

}
