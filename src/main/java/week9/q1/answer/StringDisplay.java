package week9.q1.answer;

public class StringDisplay extends AbstractDisplay implements Display {

	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	protected String createFirstElement() {
		return createLine();
	}

	@Override
	protected String createInnerElement() {
		return ("|" + string + "|") + System.lineSeparator();
	}

	@Override
	protected String createLastElement() {
		return createLine();
	}

	private String createLine() {
		StringBuilder sb = new StringBuilder();

		sb.append("*");
		for (int i = 0; i < width; i++) {
			sb.append("-");
		}
		sb.append("*");
		sb.append(System.lineSeparator());
		return sb.toString();
	}

}
