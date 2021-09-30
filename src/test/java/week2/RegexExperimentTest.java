package week2;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class RegexExperimentTest {

	@Test
	void test() {
		assertTimeout(Duration.ofMillis(100), RegexExperiment::run);
	}

}
