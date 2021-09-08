package week0;

public class Experiment1_8 {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Change value in method");
		StaticHasInitializer.primitiveTypeVariable = 1;
		StaticHasInitializer.referenceTypeVariable = new String("changed1");
		StaticHasInitializer.printStatus();
	}

}
