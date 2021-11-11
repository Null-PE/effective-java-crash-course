package week5.q3;

public class UniqueNumberGeneratorSingleton {

	public static UniqueNumberGeneratorSingleton getInstance() {
		return Holder.counter;
	}

	private static class Holder {

		static {
			// initialize method
		}

		private static final UniqueNumberGeneratorSingleton counter = new UniqueNumberGeneratorSingleton();
	}

	private int currentNumber = 0;

	public int generate() {
		return currentNumber++;
	}

}
