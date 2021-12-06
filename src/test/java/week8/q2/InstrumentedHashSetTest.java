package week8.q2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.Test;


class InstrumentedHashSetTest {

	@Test
	void testAdd() {
		InstrumentedHashSet<String> set = new InstrumentedHashSet<String>();
		set.add("A");
		set.add("A");
		set.add("A");
		assertThat(set.getAddCount(), is(3));

	}

	@Test
	void testAddAll() {
		InstrumentedHashSet<String> set = new InstrumentedHashSet<String>();
		set.addAll(Arrays.asList("A", "B", "C"));
		assertThat(set.getAddCount(), is(3));
	}
}
