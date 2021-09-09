package week0;

public class Experiment1_8 {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("Program Start");
		StaticHasInitializer.csp = 1;
		StaticHasInitializer.csr = new String("changed1");
		StaticHasInitializer.printStatus();
	}

}
