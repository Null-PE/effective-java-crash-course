package week2.answer;

import java.util.regex.Pattern;

public class RegexExperiment {

	public static final Pattern PATTERN_JP_PHONE_NUMBER = Pattern.compile("\"0\\\\d{1,4}-\\\\d{1,4}-\\\\d{4}\"");

	public static void run() {

		String phoneNumber = "03-1234-5678";

		for (int i = 0; i < 100000; i++) {
			PATTERN_JP_PHONE_NUMBER.matcher(phoneNumber).matches();
		}

	}
}
