package week2;

public class StringExperiment {

	private static String CONSTANT = "ABC" + "DEF";

	//TODO 2 improve speed and memory usage
	public static String run() {
		String str = "";
		for (int i = 0; i < 100000; i++) {
			str = str + new String("あ");
			// str = str + "あ");
		}
		return str;
	}
}
