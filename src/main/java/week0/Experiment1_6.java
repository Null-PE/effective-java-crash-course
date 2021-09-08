package week0;

public class Experiment1_6 {

	public static void main(String[] args) throws ClassNotFoundException {

		Static.printStatus();
		Static.primitiveTypeVariable = 1;
		Static.referenceTypeVariable = new String("changed");

		Static.printStatus();

	}

}
