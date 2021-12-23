package week9.q1;

public class StringDisplay extends AbstractDisplay {

	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public String createFirstElement() {
		return createLine();
	}

	@Override
	public String createInnerElement() {
		return ("|" + string + "|" + System.lineSeparator());
	}

	@Override
	public String createLastElement() {
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
