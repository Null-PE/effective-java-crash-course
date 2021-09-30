package week2;

public class BoxingExperiment {

	//TODO 3 improve speed and memory usage
	public static Long run() {
		Long sum = 0L;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		return sum;
	}
}
