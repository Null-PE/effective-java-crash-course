package week8.q1;

public class StringDisplay {

	private String string;
	private int width;

	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	public String createDisplayString() {
		StringBuilder sb = new StringBuilder();
		sb.append(createFirstElement());
		for (int i = 0; i < 5; i++) {
			sb.append(createInnerElement());
		}
		sb.append(createLastElement());
		return sb.toString();
	}

	public String createFirstElement() {
		return createLine();
	}

	public String createInnerElement() {
		return ("|" + string + "|");
	}

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
		return sb.toString();
	}

}
