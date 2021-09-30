package week2;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class StringExperimentTest {
    @Test
    void test() {
        String result = assertTimeout(Duration.ofMillis(500), StringExperiment::run);
        assertThat(result.length(), is(100000));
    }
}
