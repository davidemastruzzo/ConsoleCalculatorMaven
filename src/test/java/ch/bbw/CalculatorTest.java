package ch.bbw;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test Class for {@link Calculator}
 *
 * @author Davide Mastruzzo
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSumTwoPositivesIsOk() {

        int sum = calculator.summe(10, 25);

        assertEquals(sum, 35);
    }

    @Test
    public void testSubtractionTwoPositivesIsOk() {

        int difference = calculator.subtraction(25, 10);

        assertEquals(difference, 15);
    }

    @Test
    public void testDivisionTwoPositivesIsOk() {

        int result = calculator.divide(25, 5);

        assertEquals(result, 5);
    }
}