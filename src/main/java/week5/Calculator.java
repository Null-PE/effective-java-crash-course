package week5;

public class Calculator {

	public static void main(String[] args) {

		String command = args[0];
		int x = Integer.valueOf(args[1]);
		int y = Integer.valueOf(args[2]);

		// refactor by using enum
		// Command commandEnum = Command.valueOf(command);
		// System.out.printf("%f %s %f = %f%n", x, commandEnum.getSynbol, y, "=",
		// commandEnum.execute(x,y));
		switch (command) {
		case "PLUS":
			System.out.printf("%f %s %f = %f%n", x, "+", y, "=", x + y);
		case "MINUS":
			System.out.printf("%f %s %f = %f%n", x, "-", y, "=", x - y);
		case "TIMES":
			System.out.printf("%f %s %f = %f%n", x, "*", y, "=", x * y);
		case "DIVIDE":
			System.out.printf("%f %s %f = %f%n", x, "/", y, "=", x / y);
		default:
			throw new IllegalArgumentException("Unsupported Commnad");
		}

	}
}
