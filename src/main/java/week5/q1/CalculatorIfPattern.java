package week5.q1;

public class CalculatorIfPattern {

	public static int calculate(String commandStr, int x, int y) {

		if ("PLUS".equalsIgnoreCase(commandStr)) {
			return x + y;
		} else if ("MINUS".equalsIgnoreCase(commandStr)) {
			return x - y;
		} else if ("TIMES".equalsIgnoreCase(commandStr)) {
			return x * y;
		} else if ("DIVIDE".equalsIgnoreCase(commandStr)) {
			return x / y;
		}
		throw new IllegalArgumentException("Unsupported Commnad");
	}
}
