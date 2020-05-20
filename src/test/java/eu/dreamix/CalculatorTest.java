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

}
