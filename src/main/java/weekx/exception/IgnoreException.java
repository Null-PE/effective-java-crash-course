package weekx.exception;

import java.io.FileReader;

public class IgnoreException {

	public static void main(String[] args) {

		try (FileReader filereader = new FileReader(
				"./effective-java-crash-course/src/main/java/weekx/exception/main1.txt");) {
			int ch;
			while ((ch = filereader.read()) != -1) {
				System.out.print((char) ch);
			}
			// TODO change code ITEM77
		} catch (Exception ignored) {
		}

	}

}
