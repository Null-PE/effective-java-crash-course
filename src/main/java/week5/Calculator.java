package week5;

public class Calculator {

	public static String calculate(String command, double x, double y) {
		/* TODO refactor by using enum
		 Command commandEnum = Command.valueOf(command);
		 System.out.printf("%.1f %s %.1f = %f%n", x, commandEnum.getSynbol, y, "=",
		 commandEnum.execute(x,y));
		 */
		String format = "%.1f %s %.1f = %.1f";
		if ("PLUS".equalsIgnoreCase(command)) {
			return String.format(format, x, "+", y, x + y);
		} else if ("MINUS".equalsIgnoreCase(command)) {
			return String.format(format, x, "-", y, x - y);
		} else if ("MULTIPLY".equalsIgnoreCase(command)) {
			return String.format(format, x, "*", y, x * y);
		} else if ("DIVIDE".equalsIgnoreCase(command)) {
			return String.format(format, x, "/", y, x / y);
		}
		throw new IllegalArgumentException("Unsupported Commnad");
	}
}
