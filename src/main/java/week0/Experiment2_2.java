package week0;

public class Experiment2_2 {

	public static void main(String[] args) {

		Integer lr1 = new Integer(1);
		Integer lr2 = new Integer(1);

		System.out.println("lr1 == lr2 :" + (lr1 == lr2));
		System.out.println("lr1.equals(lr2):" + lr1.equals(lr2));

		Integer lr3 = Integer.valueOf(1);
		Integer lr4 = Integer.valueOf(1);
		System.out.println("lr3 == lr4 :" + (lr3 == lr4));
		System.out.println("lr3.equals(lr4):" + lr3.equals(lr4));

		System.out.println("lr1 == lr3 :" + (lr1 == lr3));
		System.out.println("lr1.equals(lr3):" + lr1.equals(lr3));

		Integer lr5 = Integer.valueOf(129);
		Integer lr6 = Integer.valueOf(129);

		System.out.println("lr5 == lr6 :" + (lr5 == lr6));
		System.out.println("lr5.equals(lr6):" + lr5.equals(lr6));

	}
}
