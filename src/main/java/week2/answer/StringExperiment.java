package week2.answer;

public class StringExperiment {

	public static String run() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("あ");
		}
		return sb.toString();
	}
}
