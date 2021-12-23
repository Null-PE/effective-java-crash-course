package week9.q1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;



class DisplayTest {

	@Test
	void testCharDisplay() {
		Display charDisplay = new CharDisplay('H');
		assertThat(charDisplay.createDisplayString(), is("<<HHHHH>>"));
	}

}
