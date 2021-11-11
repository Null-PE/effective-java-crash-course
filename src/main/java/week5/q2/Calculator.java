package week5.q2;

public class Calculator {

	public static final String FORMAT_FORMULA = "%.1f %s %.1f = %.1f";;

	public static String createFomulaWithAnswer(String commandStr, double x, double y) {

		// TODO 2
		// Command command = Command.valueOf(commandStr.toUpperCase());
		// return String.format(FORMAT_FORMULA, x, command.getSynbol(), y, command.execute(x,y))

		if ("PLUS".equalsIgnoreCase(commandStr)) {
			return String.format(FORMAT_FORMULA, x, "+", y, x + y);
		} else if ("MINUS".equalsIgnoreCase(commandStr)) {
			return String.format(FORMAT_FORMULA, x, "-", y, x - y);
		} else if ("MULTIPLY".equalsIgnoreCase(commandStr)) {
			return String.format(FORMAT_FORMULA, x, "*", y, x * y);
		} else if ("DIVIDE".equalsIgnoreCase(commandStr)) {
			return String.format(FORMAT_FORMULA, x, "/", y, x / y);
		}
		throw new IllegalArgumentException("Unsupported Commnad");
	}
}
