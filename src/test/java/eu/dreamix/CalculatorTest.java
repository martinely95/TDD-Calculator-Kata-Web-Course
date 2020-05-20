package eu.dreamix;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {

    @Parameters
    public static Collection<Object[]> generateParameters() {
        return Arrays.asList(new Object[][]{
                { "", 0 },
                { null, 0 },
                { "1", 1 },
                { "1,2", 3 },
                { "1,2,5,6,7", 21 },
                { "1\n2,5", 8 },
                { "//;\\n1;2;1;5", 9 },
        });
    }

    private final String inputString;
    private final int expectedResult;

    public CalculatorTest(String inputString, int expectedResult) {
        this.inputString = inputString;
        this.expectedResult = expectedResult;
        System.out.println("Hello World TDD version in constructor");
    }

    private Calculator objectUnderTest;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Hello World TDD version @BeforeClass annotation");
    }

    @Before
    public void setUp() {
        objectUnderTest = new Calculator();
        System.out.println();
        System.out.println("Hello World TDD version @Before annotation");
    }

    @Test
    public void add_shouldReturnExpectedResult_whenCorrectInput_isProvided() {
        // given: this.inputString and this.objectUnderTest

        // when
        int result = objectUnderTest.add(inputString);

        // then
        assertEquals(expectedResult, result);
    }

}
