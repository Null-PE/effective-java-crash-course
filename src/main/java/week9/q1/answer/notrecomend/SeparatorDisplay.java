package week9.q1.answer.notrecomend;

import week9.q1.answer.Display;
import week9.q1.answer.Separator;

public class SeparatorDisplay extends Separator implements Display {

	@Override
	public String createDisplayString() {
		return createDisplayString() + System.lineSeparator();
	}

}
