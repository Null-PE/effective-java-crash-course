package week0;

public class Experiment1_4 {

	public static void main(String[] args) throws ClassNotFoundException {

		NonStatic n1 = new NonStatic();

		int lp = n1.cp;
		System.out.println("lp:" + lp);
		System.out.println("n1.cp:" + n1.cp);
	
		n1.cp = 1;
		System.out.println("lp:" + lp);
		System.out.println("n1.cp:" + n1.cp);
		
		System.out.println();
		
		String lr = n1.cr;
		n1.cr = new String("changed");

		System.out.println("lr:" + lr);
		System.out.println("n1.cr:" + n1.cr);
	}

}
