package week0;

public class Experiment1_2 {

	public static void main(String[] args) throws ClassNotFoundException {

		NonStatic n1 = new NonStatic();
		System.out.println(n1);

		n1.referenceTypeVariable = new String("changed");
		n1.primitiveTypeVariable = 2;

		System.out.println(n1);

	}

}
