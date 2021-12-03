package week8.q1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class CharDisplayTest {

	@Test
	void test() {
		CharDisplay charDisplay = new CharDisplay('H');
		assertThat(charDisplay.createDisplayString(), is("<<HHHHH>>"));
	}

}
