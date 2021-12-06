package week8.q1.answer2;

public abstract class AbstractDisplay implements Display {

	@Override
	public final String createDisplayString() {
		StringBuilder sb = new StringBuilder();
		sb.append(createFirstElement());
		for (int i = 0; i < 5; i++) {
			sb.append(createInnerElement());
		}
		sb.append(createLastElement());
		return sb.toString();
	}

	protected abstract String createFirstElement();

	protected abstract String createInnerElement();

	protected abstract String createLastElement();

}
