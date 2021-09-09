package week0;

public class Experiment1_3 {

	public static void main(String[] args) throws ClassNotFoundException {

		NonStatic n1 = new NonStatic();
		n1.cr = new String("changed");
		n1.cp = 2;

		NonStatic n2 = new NonStatic();
		n1.cr = new String("changed2");
		n1.cp = 3;

		System.out.println((n2 == n1));

		n1 = n2;

		System.out.println((n2 == n1));

	}

}
