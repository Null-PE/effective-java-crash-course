package week2.answer;

public class BoxingExperiment {

	public static Long run() {
		long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}
}
