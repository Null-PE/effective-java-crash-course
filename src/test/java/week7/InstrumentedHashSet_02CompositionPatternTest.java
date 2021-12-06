package week7;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class InstrumentedHashSet_02CompositionPatternTest {

	@Test
	void testAdd() {
		InstrumentedHashSet_02CompositionPattern<String> set = new InstrumentedHashSet_02CompositionPattern<String>();
		set.add("A");
		set.add("A");
		set.add("A");
		assertThat(set.getAddCount(), is(3));

	}

	@Test
	void testAddAll() {
		InstrumentedHashSet_02CompositionPattern<String> set = new InstrumentedHashSet_02CompositionPattern<String>();
		set.addAll(Arrays.asList("A","B","C"));
		assertThat(set.getAddCount(), is(3));
	}

}
