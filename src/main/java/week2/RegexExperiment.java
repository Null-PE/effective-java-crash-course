package week2;

public class RegexExperiment {

	//TODO 4 improve the performance
	public static void run() {

		String phoneNumber = "03-1234-5678";

		for (int i = 0; i < 100000; i++) {
			phoneNumber.matches(new String("\"0\\\\d{1,4}-\\\\d{1,4}-\\\\d{4}\""));
		}

	}
}
