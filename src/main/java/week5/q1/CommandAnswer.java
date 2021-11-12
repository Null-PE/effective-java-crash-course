package week5.q1;

public enum CommandAnswer {

	PLUS {
		@Override
		public double execute(int x, int y) {
			return x + y;
		}
	};
	// TODO implement
	//MINUS, TIMES, DIVIDE;

	public abstract double execute(int x, int y);

}
