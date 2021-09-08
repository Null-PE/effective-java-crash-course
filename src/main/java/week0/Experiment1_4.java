package week0;

public class Experiment1_4 {

	public static void main(String[] args) throws ClassNotFoundException {

		NonStatic n1 = new NonStatic();

		int localPrimitive = n1.primitiveTypeVariable;
		System.out.println("localPrimitive:" + localPrimitive);
		n1.primitiveTypeVariable = 1;

		System.out.println("localPrimitive:" + localPrimitive);
		System.out.println("n1.primitiveTypeVariable:" + n1.primitiveTypeVariable);
		System.out.println();
		
		String localReference = n1.referenceTypeVariable;
		System.out.println("localReference:" + localReference);
		n1.referenceTypeVariable = new String("changed");

		System.out.println("localReference:" + localReference);
		System.out.println("n1.referenceTypeVariable:" + n1.referenceTypeVariable);
	}

}
