package week5.q1;

public class Calculator {

	public static int calculate(String commandStr, int x, int y) {

		Command command = Command.valueOf(commandStr.toUpperCase());

		// TODO 1 refactor the following code as `return command.execute(x,y)`;
		switch (command) {
		case PLUS:
			return x + y;
		case MINUS:
			return x - y;
		case TIMES:
			return x * y;
		case DIVIDE:
			return x / y;
		default:
			throw new IllegalArgumentException("Unsupported Commnad");
		}

	}
}
