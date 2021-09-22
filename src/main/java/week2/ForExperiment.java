package week2;

import java.util.ArrayList;
import java.util.List;

public class ForExperiment {

	public static void main(String[] args) {

		List<String> outer = new ArrayList<String>();
		outer.add("o-1");
		outer.add("o-2");

		List<String> inner = new ArrayList<String>();
		inner.add("i-1");
		inner.add("i-2");

		// TODO1 find bug and refactor by using foreach
		for (int i = 0; i < outer.size(); i++) {

			System.out.println(outer.get(i));

			for (int j = 0; j < inner.size(); j++) {
				System.out.println(inner.get(i));
			}

		}

	}

}
