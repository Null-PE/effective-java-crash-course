package week4;

import week4.action.AddAction;

public class App {

	public static final String ADD = "ADD";
	public static final String UPDATE = "UPDATE";
	public static final String DELETE = "DELETE";

	public static void main(String[] args) {

		String command = args[0];
		String name = args[1];
		int price = Integer.valueOf(args[2]);
		// TODO 2 convert int to Enum
		int conditionCategory = Integer.valueOf(args[3]);
		// TODO 2 convert int to Enum
		int conditionRate = Integer.valueOf(args[4]);

		if (command.equalsIgnoreCase(ADD)) {
			new AddAction().execute(name, price, conditionCategory, conditionRate);
		} else if (command.equalsIgnoreCase(UPDATE)) {
			// call update logic
		} else if (command.equalsIgnoreCase(DELETE)) {
			// call delete logic
		} else {
			throw new IllegalArgumentException("command not supported");
		}

	}

}
