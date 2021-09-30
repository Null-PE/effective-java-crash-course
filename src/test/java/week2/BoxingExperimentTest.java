package week2;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class BoxingExperimentTest {

    @Test
    void test() {
        Long result = assertTimeout(Duration.ofMillis(2000), BoxingExperiment::run);
        assertThat(result, is(2305843005992468481L));
    }
}
