package week5.q1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import week5.q1.Calculator;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

	@ParameterizedTest
	@ValueSource(strings = { "PLUS", "plus" })
	void plus(String command) {
		assertThat(Calculator.calculate(command, 2, 3), is(5));
	}

	@ParameterizedTest
	@ValueSource(strings = { "MINUS", "minus" })
	void minus(String command) {
		assertThat(Calculator.calculate(command, 10, 4), is(6));
	}

	@ParameterizedTest
	@ValueSource(strings = { "TIMES", "times" })
	void multi(String command) {
		assertThat(Calculator.calculate(command, 2, 5), is(10));
	}

	@ParameterizedTest
	@ValueSource(strings = { "DIVIDE", "divide" })
	void divide(String command) {
		assertThat(Calculator.calculate(command, 9, 3), is(3));
	}

	@Test
	void illegalArgument() {
		assertThrows(IllegalArgumentException.class, () -> Calculator.calculate("", 1, 2));
	}

}