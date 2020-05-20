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
}
