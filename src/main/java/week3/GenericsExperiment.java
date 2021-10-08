package week3;

import java.util.ArrayList;
import java.util.List;

public class GenericsExperiment {

	public static void main(String[] args) {
		
		// TODO 1
		List stringList = new ArrayList();
		stringList.add("1");
		stringList.add(Integer.valueOf(1)); // <-- このようなIntegerの代入を防ぐにはどうすればいいでしょう
		
		for (int i = 0; i < stringList.size(); i++) {
			String value = (String) stringList.get(i);
			System.out.println(value);
		}

	}
}
