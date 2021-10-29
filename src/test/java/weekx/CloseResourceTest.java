package weekx;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

class CloseResourceTest {

    @Test
    void test() throws Exception{
        try {
            CloseResource.readFirstLine();
        } catch (IOException e) {
            assertThat(e.getMessage(), containsString("Readline Exception"));
        }
    }

}
