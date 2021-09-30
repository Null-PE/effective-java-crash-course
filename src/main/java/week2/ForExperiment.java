package week2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class ForExperiment {

	public static String run() {

		List<List> outer = new ArrayList<List>();

		List<String> inner1 = new ArrayList<String>();
		inner1.add("i1-1");
		inner1.add("i1-2");

		outer.add(inner1);

		List<String> inner2 = new ArrayList<String>();
		inner2.add("i2-1");
		inner2.add("i2-2");

		outer.add(inner2);

		// TODO 1 fix bugs and refactor by using foreach(拡張）
		// Item58
		String result = "";
		for (int i = 0; i < outer.size(); i++) {

			List<String> inner = outer.get(i);

			for (int j = 0; j < inner.size(); j++) {
				result += inner.get(i);
			}
		}

		return result;
	}

}
