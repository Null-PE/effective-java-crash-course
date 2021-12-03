package week8.q1;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class StringDisplayTest {

	@Test
	void test() {
		StringDisplay stringDisplay = new StringDisplay("Hello");
		assertThat(stringDisplay.createDisplayString(), is("*-----*|Hello||Hello||Hello||Hello||Hello|*-----*"));
		
	}

}
