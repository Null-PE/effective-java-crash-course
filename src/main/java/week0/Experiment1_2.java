package week0;

public class Experiment1_2 {

	public static void main(String[] args) throws ClassNotFoundException {

		NonStatic n1 = new NonStatic();
		System.out.println(n1);

		n1.cr = new String("changed1");
		n1.cp = 1;

		System.out.println(n1);

	}

}
