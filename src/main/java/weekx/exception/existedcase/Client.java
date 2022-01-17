package weekx.exception.existedcase;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		capitalize(loadNameList());
	}

	private static List<String> loadNameList() {
		List<String> list = new ArrayList<String>();
		list.add("kobayashi");
		list.add(null);
		list.add("");
		list.add("sato");
		return list;
	}

	private static List<String> capitalize(List<String> names) {

		List<String> capitalizedNames = new ArrayList<String>();
		for (String name : names) {
			capitalizedNames.add(StringUtils.capitalize(name));
		}
		return capitalizedNames;
	}
}
