package week5.q3;

public enum UniqueNumberGeneratorSingletonEnum {

	INSTANCE;

	UniqueNumberGeneratorSingletonEnum() {
		// initialize method 
	}

	private int currentNumber = 0;

	public int generate() {
		return currentNumber++;
	}

}
