package week8.q1.answer2;

public class SeparatorDisplay implements Display {

	Separator separator = new Separator();

	@Override
	public String createDisplayString() {
		return separator.createSeparator();
	}

}
