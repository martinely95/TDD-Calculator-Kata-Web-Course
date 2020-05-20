package eu.dreamix;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void add_shouldExecuteSuccessfully_whenEmptyString_isProvided() {
        // given
        String inputString = "";
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(inputString);

        // then
    }

    //add_shouldReturn0_whenEmptyString_isProvided
}
