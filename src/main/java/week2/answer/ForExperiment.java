package week2.answer;

import java.util.ArrayList;
import java.util.List;

public class ForExperiment {

	public static String run() {

		List<List<String>> outer = new ArrayList<List<String>>();

		List<String> inner1 = new ArrayList<String>();
		inner1.add("i1-1");
		inner1.add("i1-2");

		outer.add(inner1);

		List<String> inner2 = new ArrayList<String>();
		inner2.add("i2-1");
		inner2.add("i2-2");

		outer.add(inner2);

		String result = "";
		for (List<String> inner : outer) {
			for (String value : inner) {
				result += value;
			}
		}

		return result;
	}

}
