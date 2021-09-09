package week0;

public class Experiment1_6 {

	public static void main(String[] args) throws ClassNotFoundException {

		Static.printStatus();
		
		Static.csp = 1;
		Static.csr = new String("changed1");
		Static.printStatus();

	}

}
