package week9.q1.answer;

public class SeparatorDisplay implements Display {

	private Separator separator = new Separator();

	@Override
	public String createDisplayString() {
		return separator.createSeparator() + System.lineSeparator();
	}

}
