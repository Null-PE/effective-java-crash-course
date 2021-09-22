package week2;

public class StringExperiment {

	private static String CONSTANT = "ABC" + "DEF";

	public static void main(String[] args) {

		long startTimeMills = System.currentTimeMillis();

		//TODO2 improve speed and memory usage
		String str = "";
		for (int i = 0; i < 100000; i++) {
			str = str + new String("あ");
			// str = str + "あ");
		}
		System.out.println(str);

		long endTimeMills = System.currentTimeMillis();
		System.out.println(Long.valueOf(endTimeMills - startTimeMills));

	}
}
