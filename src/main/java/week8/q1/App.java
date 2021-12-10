package week8.q1;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Object> displays = createDisplays();
		System.out.println(display(displays));
	}

	private static List<Object> createDisplays() {
		List<Object> displays = new ArrayList<Object>();
		displays.add(new CharDisplay('h'));
		displays.add(new StringDisplay("String"));
		return displays;
	}

	// TODO refactor this method after refactor CharDisplay and StringDisplay
	// 同一視
	private static String display(List<Object> displays) {

		StringBuilder sb = new StringBuilder();
		for (Object object : displays) {
			
			if (object instanceof CharDisplay) {
				sb.append(((CharDisplay) object).createDisplayString());
			} else if (object instanceof StringDisplay) {
				sb.append(((StringDisplay) object).createDisplayString());
			}
			
			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}
