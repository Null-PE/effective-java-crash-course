package week8.q1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AbstractDisplayTest {

	@Test
	void testCharDisplay() {
		AbstractDisplay charDisplay = new CharDisplay('H');
		assertThat(charDisplay.createDisplayString(), is("<<HHHHH>>"));
	}
	
	@Test
	void testStringDisplay() {
		AbstractDisplay stringDisplay = new StringDisplay("Hello");
		assertThat(stringDisplay.createDisplayString(), is("*-----*|Hello||Hello||Hello||Hello||Hello|*-----*"));
	}

}
