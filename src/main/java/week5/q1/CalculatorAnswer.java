package week5.q1;

public class CalculatorAnswer {

	public static int calculate(String commandStr, int x, int y) {
		CommandAnswer command = CommandAnswer.valueOf(commandStr.toUpperCase());
		return command.execute(x, y);
	}
}
