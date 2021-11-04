package week5;

public class Calculator {

	public static void main(String[] args) {

		String command = args[0];
		double x = Double.parseDouble(args[1]);
		double y = Double.parseDouble(args[2]);

		// TODO refactor by using enum
		// Command commandEnum = Command.valueOf(command);
		// System.out.printf("%.1f %s %.1f = %f%n", x, commandEnum.getSynbol, y, "=",
		// commandEnum.execute(x,y));
		if ("PLUS".equalsIgnoreCase(command)) {
			System.out.printf("%.1f %s %.1f = %.1f%n", x, "+", y, x + y);
		} else if ("MINUS".equalsIgnoreCase(command)) {
			System.out.printf("%.1f %s %.1f = %.1f%n", x, "-", y, x - y);
		} else if ("MINUS".equalsIgnoreCase(command)) {
			System.out.printf("%.1f %s %.1f = %.1f%n", x, "*", y, x * y);
		} else if ("MINUS".equalsIgnoreCase(command)) {
			System.out.printf("%.1f %s %.1f = %.1f%n", x, "/", y, x / y);
		} else {
			throw new IllegalArgumentException("Unsupported Commnad");
		}

	}
}
