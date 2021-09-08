package week0;

public class Experiment2_2 {

	public static void main(String[] args) {

		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);

		System.out.println("i1 == i2 :" + (i1 == i2));
		System.out.println("i1.equals(i2):" + i1.equals(i2));

		Integer i3 = Integer.valueOf(1);
		Integer i4 = Integer.valueOf(1);
		System.out.println("i3 == i4 :" + (i3 == i4));
		System.out.println("i3.equals(i4):" + i3.equals(i4));

		System.out.println("i1 == i3 :" + (i1 == i3));
		System.out.println("i1.equals(i3):" + i1.equals(i3));

		Integer i5 = Integer.valueOf(129);
		Integer i6 = Integer.valueOf(129);

		System.out.println("i5 == i6 :" + (i5 == i6));
		System.out.println("i5.equals(i6):" + i5.equals(i6));

	}
}
