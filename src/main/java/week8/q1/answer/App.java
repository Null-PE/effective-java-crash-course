package week8.q1.answer;

import java.util.ArrayList;
import java.util.List;

public class App {

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
