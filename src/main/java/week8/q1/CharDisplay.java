package week8.q1;

public class CharDisplay {

	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
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
		return "<<";
	}

	public String createInnerElement() {
		return String.valueOf(ch);

	}

	public String createLastElement() {
		return ">>";
	}

}
