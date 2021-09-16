package week1;

public class EqualsExperiment {

	public static void main(String[] args) {

		String s1 = new String("ABC");
		String s2 = new String("ABC");

		// 参照先が同じか
		System.out.println(s1 == s2);

		// Stringオブジェクト内のフィールドchar value[];の値が同じか
		System.out.println(s1.equals(s2));

		String s3 = new String("ABC1");
		String s4 = new String("ABC2");

		System.out.println(s3 == s4);

		System.out.println(s3.equals(s4));

	}
}
