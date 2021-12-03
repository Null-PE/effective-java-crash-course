package week8.q1.answer;

public class CharDisplay extends AbstractDisplay {

	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	protected String createFirstElement() {
		return "<<";
	}

	@Override
	protected String createInnerElement() {
		return String.valueOf(ch);
	}

	@Override
	protected String createLastElement() {
		return ">>";
	}

}
