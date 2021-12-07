package weekx.defensivecopy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DurationTest {

	Date sDate;
	long expected;

	@BeforeEach
	void setUp() {

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2001);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 1);
		sDate = new Date(c.getTimeInMillis());
		expected = c.getTimeInMillis();
	}

	@Test
	void test1() {

		Duration duration = new Duration(sDate, new Date());

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2002);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.DAY_OF_MONTH, 2);
		sDate.setTime(c.getTimeInMillis());

		assertThat(duration.getStartDate().getTime(), is(expected));

	}

	@Test
	void test2() {

		Duration duration = new Duration(sDate, new Date());
		Date date = duration.getStartDate();

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2002);
		c.set(Calendar.MONTH, Calendar.FEBRUARY);
		c.set(Calendar.DAY_OF_MONTH, 2);
		date.setTime(c.getTimeInMillis());

		assertThat(duration.getStartDate().getTime(), is(expected));

	}

}
