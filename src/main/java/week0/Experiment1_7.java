package week0;

public class Experiment1_7 {

	public static void main(String[] args) throws ClassNotFoundException {

		Static static1 = new Static();
		static1.csp = 1;
		static1.csr = new String("changed1");

		Static static2 = new Static();
		static2.csp = 2;
		static2.csr = new String("changed2");

		System.out.println();

		System.out.println("static1:" + static1.csp);
		System.out.println("static2:" + static2.csp);
		System.out.println("Static1:" + Static.csp);

		System.out.println();

		System.out.println("static1" + static1.csr);
		System.out.println("static2" + static2.csr);
		System.out.println("Static1" + Static.csr);

	}

}
