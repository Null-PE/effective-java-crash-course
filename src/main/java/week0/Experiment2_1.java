package week0;

public class Experiment2_1 {

	public static void main(String[] args) {

		String lr1 = "あいう";
		String lr2 = "あいう";

		System.out.println("lr1 == lr2 :" + (lr1 == lr2));
		System.out.println("lr1.equals(lr2):" + lr1.equals(lr2));

		String lr3 = new String("あいう");
		System.out.println("lr1 == lr3 :" + (lr1 == lr3));
		System.out.println("lr1.equals(lr3):" + lr1.equals(lr3));

		String lr4 = new String("あいう");
		System.out.println("lr4 == lr3 :" + (lr4 == lr3));
		System.out.println("lr4.equals(lr3):" + lr4.equals(lr3));
	}
}
