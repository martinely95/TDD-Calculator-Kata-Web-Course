package eu.dreamix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add_shouldReturn0_whenEmptyString_isProvided() {
        // given
        String inputString = "";
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
        assertEquals(0, result);
    }

    @Test
    public void add_shouldReturn0_whenNullString_isProvided() {
        // given
        String inputString = null;
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
        assertEquals(0, result);
    }

    @Test
    public void add_shouldReturnNumber_whenSingleNumber_isProvided() {
        // given
        String inputString = "1";
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
        assertEquals(1, result);
    }

    @Test
    public void add_shouldReturnSum_whenTwoNumbers_areProvided() {
        // given
        String inputString = "1,2";
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
        assertEquals(3, result);
    }

    @Test
    public void add_shouldReturnSum_whenMultipleNumbers_areProvided() {
        // given
        String inputString = "1,2,5,6,7";
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
        assertEquals(21, result);
    }

    @Test
    public void add_shouldReturnSum_whenMultipleNumbersMixedWithNewLineSeparator_areProvided() {
        // given
        String inputString = "1\n2,5";
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
        assertEquals(8, result);
    }

    @Test
    public void add_shouldReturnSum_whenMultipleNumbersWithDifferentDelimiter_areProvided() {
        // given
        String inputString = "//;\\n1;2;1;5";
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
        assertEquals(9, result);
    }
}
