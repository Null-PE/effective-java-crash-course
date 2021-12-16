package week9.q1;

import java.util.ArrayList;
import java.util.List;

public class App {

	// TODO you got new request to add separator between CharDisplay and StringDisplay
	// expected
	// <<hhhhh>>
	// ===========
	// *------*
	// |String|
	// |String|
	// |String|
	// |String|
	// |String|
	// *------*
	// please use week9.q1.adaptee.Separator and achive the above request.
	// hint:Adapter pattern and Decorator

	public static void main(String[] args) {
		List<AbstractDisplay> displays = createDisplays();
		System.out.println(display(displays));
	}

	private static List<AbstractDisplay> createDisplays() {
		List<AbstractDisplay> displays = new ArrayList<AbstractDisplay>();
		displays.add(new CharDisplay('h'));
		displays.add(new StringDisplay("String"));
		return displays;
	}

	private static String display(List<AbstractDisplay> displays) {

		StringBuilder sb = new StringBuilder();
		for (AbstractDisplay display : displays) {
			sb.append(display.createDisplayString());
		}
		return sb.toString();
	}

}
