package week9.q1.answer;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Display> displays = createDisplays();
		System.out.println(display(displays));
	}

	private static List<Display> createDisplays() {
		List<Display> displays = new ArrayList<Display>();
		displays.add(new CharDisplay('h'));
		displays.add(new SeparatorDisplay());
		displays.add(new StringDisplay("String"));
		return displays;
	}

	private static String display(List<Display> displays) {

		StringBuilder sb = new StringBuilder();
		for (Display display : displays) {
			sb.append(display.createDisplayString());
		}
		return sb.toString();
	}

}
