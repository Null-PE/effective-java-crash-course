package week0;

public class Experiment1_7 {

	public static void main(String[] args) throws ClassNotFoundException {

		Static static1 = new Static();
		static1.primitiveTypeVariable = 1;
		static1.referenceTypeVariable = new String("changed1");

		Static static2 = new Static();
		static2.primitiveTypeVariable = 2;
		static2.referenceTypeVariable = new String("changed2");

		System.out.println();

		System.out.println("static1:" + static1.primitiveTypeVariable);
		System.out.println("static2:" + static2.primitiveTypeVariable);
		System.out.println("Static1:" + Static.primitiveTypeVariable);

		System.out.println();

		System.out.println("static1" + static1.referenceTypeVariable);
		System.out.println("static2" + static2.referenceTypeVariable);
		System.out.println("Static1" + Static.referenceTypeVariable);

	}

}
