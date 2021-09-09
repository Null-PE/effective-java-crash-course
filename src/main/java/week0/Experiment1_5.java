package week0;

public class Experiment1_5 {

	public static void main(String[] args) throws ClassNotFoundException {

		long lp = 1;
		method1(lp);
		System.out.println(lp);

		NonStatic lr = new NonStatic();
		method2(lr);
		System.out.println(lr);

		method3(lr);
		System.out.println(lr);

	}

	public static void method1(long mp) {
		mp = 2;
	}

	public static void method2(NonStatic mr) {
		mr.cp = 2;
		mr.cr = new String("method2");
	}

	public static void method3(NonStatic mr) {
		mr = new NonStatic();
		mr.cp = 3;
		mr.cr = new String("method3");
	}

}
