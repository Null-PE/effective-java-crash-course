package week9.q1.answer.notrecomend;

import week9.q1.answer.Display;
import week9.q1.answer.Separator;

//Not recomended because separator is not designed to be extended.
public class SeparatorDisplay extends Separator implements Display {

	@Override
	public String createDisplayString() {
		return createSeparator() + System.lineSeparator();
	}

}
