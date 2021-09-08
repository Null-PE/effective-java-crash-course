package week0;

public class Experiment2_1 {

	public static void main(String[] args) {

		String s1 = "あいう";
		String s2 = "あいう";

		System.out.println("s1 == s2 :" + (s1 == s2));
		System.out.println("s1.equals(s2):" + s1.equals(s2));

		String s3 = new String("あいう");
		System.out.println("s1 == s3 :" + (s1 == s3));
		System.out.println("s1.equals(s3):" + s1.equals(s3));

	}
}
