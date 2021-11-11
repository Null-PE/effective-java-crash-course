package week5.q2;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"PLUS", "plus"})
    void plus(String command) {
        assertThat(Calculator.createFomulaWithAnswer(command, 2f, 3f), is("2.0 + 3.0 = 5.0"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"MINUS", "minus"})
    void minus(String command) {
        assertThat(Calculator.createFomulaWithAnswer(command, 321.123f, 123.321f), is("321.1 - 123.3 = 197.8"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"MULTIPLY", "multiply"})
    void multi(String command) {
        assertThat(Calculator.createFomulaWithAnswer(command, 2.4f, 1.2f), is("2.4 * 1.2 = 2.9"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"DIVIDE", "divide"})
    void divide(String command) {
        assertThat(Calculator.createFomulaWithAnswer(command, 9.2f, 1.2f), is("9.2 / 1.2 = 7.7"));
    }

    @Test
    void illegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.createFomulaWithAnswer("", 1f, 2f));
    }


}