package week8.q1.answer2;

public class StringDisplay extends AbstractDisplay {

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
		return ("|" + string + "|");
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
		return sb.toString();
	}

}
