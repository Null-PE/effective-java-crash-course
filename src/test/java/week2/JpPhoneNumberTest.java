package week2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JpPhoneNumberTest {

    @DisplayName("parse() Null")
    @Test
    void nullArgument() {
        assertThrows(NullPointerException.class, () -> JpPhoneNumber.parse(null));
    }

    @ParameterizedTest(name = "不正な引数[{0}]の場合、IllegalArgumentException発生すべき")
    @ValueSource(strings = {"", "0123412341234", "0-1234-1234", "0123-1234",
            "1123-1234-1234", "012a-1234-1234", "0123-123a-1234", "0123-1234-123a",
            "01234-1234-1234", "0123-12345-1234", "0123-1234-12345", "0123-1234-123"})
    void illegalArgument(String arg) {
        assertThrows(IllegalArgumentException.class, () -> JpPhoneNumber.parse(arg));
    }

    @ParameterizedTest(name = "引数[{0}]を受け取る")
    @CsvSource(value = {"0123-1234-1234, 0123, 1234, 1234",
            "01-1-7890, 01, 1, 7890",
            "012-12-1234, 012, 12, 1234",
            "0123-432-8888, 0123, 432, 8888",
    })
    void parse(String input, String areaCode, String cityCode, String sub) throws Exception {
        JpPhoneNumber target = JpPhoneNumber.parse(input);
        assertThat(target.getAreaCodeWithZeroPrefix(), is(areaCode));
        assertThat(target.getCityCode(), is(cityCode));
        assertThat(target.getSubscriberNumber(), is(sub));
    }

    @ParameterizedTest
    @CsvSource(value = {",,", "0123,,1234", ",123,1234", "0123,123,"})
    void nullArguments(String areaCode, String cityCode, String sub) throws Exception {
        assertThrows(NullPointerException.class, () -> JpPhoneNumber.of(areaCode, cityCode, sub));
    }

    @ParameterizedTest
    @CsvSource(value = {"1123,1234,1234", "0,1234,1234", "01234,1234,1234",
            "0123,12345,1234", "0123,1234,1", "0123,1234,12345",
            "012a,1234,1234", "0123,123a,1234", "0123,1234,123a",})
    void invalidArguments(String areaCode, String cityCode, String sub) throws Exception {
        assertThrows(IllegalArgumentException.class, () -> JpPhoneNumber.of(areaCode, cityCode, sub));
    }

    @ParameterizedTest(name = "引数[{0}-{1}-{2}]を受け取る")
    @CsvSource(value = {"0123, 1234, 1234",
            "01, 1, 7890",
            "012, 12, 1234",
            "0123, 432, 8888",
    })
    void of(String areaCode, String cityCode, String sub) throws Exception {
        JpPhoneNumber target = JpPhoneNumber.of(areaCode, cityCode, sub);
        assertThat(target.getAreaCodeWithZeroPrefix(), is(areaCode));
        assertThat(target.getCityCode(), is(cityCode));
        assertThat(target.getSubscriberNumber(), is(sub));
    }

    @Nested
    class CompareToTest {
        @DisplayName("比較対象はNULL")
        @Test
        void compareToNull() throws Exception {
            JpPhoneNumber j1 = JpPhoneNumber.of("0123", "1234", "1234");
            assertThrows(NullPointerException.class, () -> j1.compareTo(null));
        }

        @DisplayName("同じ番号")
        @Test
        void equal() throws Exception {
            JpPhoneNumber j1 = JpPhoneNumber.of("010", "100", "1000");
            JpPhoneNumber j2 = JpPhoneNumber.of("010", "100", "1000");
            assertThat(j1.compareTo(j2), is(0));
        }

        @ParameterizedTest(name = "比較対象より大きい 010-100-1000 : {0}-{1}-{2} ")
        @CsvSource(value = {"001,100,1001", "010,100,0200"})
        void bigger(String areaCode, String cityCode, String sub) throws Exception {
            JpPhoneNumber j1 = JpPhoneNumber.of("010", "100", "1000");
            JpPhoneNumber j2 = JpPhoneNumber.of(areaCode, cityCode, sub);
            assertThat(j1.compareTo(j2), greaterThan(0));
        }

        @ParameterizedTest(name = "比較対象より小さい 010-100-1000 : {0}-{1}-{2} ")
        @CsvSource(value = {"02,100,1000", "010,2,1000", "010,100,1002"})
        void smaller(String areaCode, String cityCode, String sub) throws Exception {
            JpPhoneNumber j1 = JpPhoneNumber.of("010", "100", "1000");
            JpPhoneNumber j2 = JpPhoneNumber.of(areaCode, cityCode, sub);
            assertThat(j1.compareTo(j2), lessThan(0));
        }
    }


}
