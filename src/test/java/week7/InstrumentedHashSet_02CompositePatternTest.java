package week7;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class InstrumentedHashSet_02CompositePatternTest {

	@Test
	void testAdd() {
		InstrumentedHashSet_02CompositePattern<String> set = new InstrumentedHashSet_02CompositePattern<String>();
		set.add("A");
		set.add("A");
		set.add("A");
		assertThat(set.getAddCount(), is(3));

	}

	@Test
	void testAddAll() {
		InstrumentedHashSet_02CompositePattern<String> set = new InstrumentedHashSet_02CompositePattern<String>();
		set.add("A");
		set.add("A");
		set.add("A");
		assertThat(set.getAddCount(), is(3));
	}

}
