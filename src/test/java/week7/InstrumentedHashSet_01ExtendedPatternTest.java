package week7;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class InstrumentedHashSet_01ExtendedPatternTest {

	@Test
	void testAdd() {
		InstrumentedHashSet_01ExtendedPattern<String> set = new InstrumentedHashSet_01ExtendedPattern<String>();
		set.add("A");
		set.add("A");
		set.add("A");
		assertThat(set.getAddCount(), is(3));

	}

	@Test
	void testAddAll() {
		InstrumentedHashSet_01ExtendedPattern<String> set = new InstrumentedHashSet_01ExtendedPattern<String>();
		set.add("A");
		set.add("A");
		set.add("A");
		assertThat(set.getAddCount(), is(3));
	}

}
