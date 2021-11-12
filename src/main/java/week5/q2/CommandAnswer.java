package week5.q2;

public enum CommandAnswer {

	PLUS("+") {
		@Override
		public double execute(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		@Override
		public double execute(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		@Override
		public double execute(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		@Override
		public double execute(double x, double y) {
			return x / y;
		}
	};

	private final String synbol;

	private CommandAnswer(String synbol) {
		this.synbol = synbol;
	}

	public String getSynbol() {
		return synbol;
	}

	public abstract double execute(double x, double y);

}
