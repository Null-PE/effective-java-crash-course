package week2;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ForExperimentTest {
    @Test
    void test() {
        assertThat(ForExperiment.run(), is("i1-1i1-2i2-1i2-2"));
    }
}
