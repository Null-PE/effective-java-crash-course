package week2;

public class BoxingExperiment {

	public static void main(String[] args) {

		long startTimeMills = System.currentTimeMillis();

		//TODO3 improve speed and memory usage
		Long sum = 0L;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i; 
		}
		System.out.println(sum);

		long endTimeMills = System.currentTimeMillis();
		System.out.println(Long.valueOf(endTimeMills - startTimeMills));

	}
}
