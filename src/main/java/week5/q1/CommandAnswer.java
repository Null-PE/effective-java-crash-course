package week5.q1;

public enum CommandAnswer {

	PLUS {
		@Override
		public int execute(int x, int y) {
			return x + y;
		}
	},
	MINUS {
		@Override
		public int execute(int x, int y) {
			return x - y;
		}
	},
	TIMES {
		@Override
		public int execute(int x, int y) {
			return x * y;
		}
	},
	DIVIDE {
		@Override
		public int execute(int x, int y) {
			return x / y;
		}
	};

	public abstract int execute(int x, int y);

}
