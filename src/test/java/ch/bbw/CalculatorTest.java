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
    public void testSumOnePositiveOneNegativeIsOk() {

        int sum = calculator.summe(-10, 25);

        assertEquals(sum, 15);
    }

    @Test
    public void testSumTwoNegativesIsOk() {

        int sum = calculator.summe(-10, -25);

        assertEquals(sum, -35);
    }

    @Test
    public void testSumZeroAndPositiveIsOk() {

        int sum = calculator.summe(0, 10);

        assertEquals(sum, 10);
    }

    @Test
    public void testSumZeroAndNegativeIsOk() {

        int sum = calculator.summe(0, -10);

        assertEquals(sum, -10);
    }

    @Test
    public void testSumTwoZerosIsOk() {

        int sum = calculator.summe(0, 0);

        assertEquals(sum, 0);
    }

    @Test
    public void testSumTwoPositivesEqualIntegerMAX_VALUEIsOk() {

        int sum = calculator.summe(10, Integer.MAX_VALUE - 10);

        assertEquals(sum, Integer.MAX_VALUE);
    }

    @Test
    public void testSumTwoPositivesGreaterThanIntegerMAX_VALUEIsOk() {

        int sum = calculator.summe(11, Integer.MAX_VALUE - 10);

        assertEquals(sum, Integer.MIN_VALUE);
    }

    @Test
    public void testSubtractionTwoPositivesIsOk() {

        int difference = calculator.subtraction(25, 10);

        assertEquals(difference, 15);
    }

    @Test
    public void testSubtractionPositiveAndNegativeIsOk() {

        int difference = calculator.subtraction(10, -25);

        assertEquals(difference, 35);
    }

    @Test
    public void testSubtractionTwoNegativesIsOk() {

        int difference = calculator.subtraction(-10, -25);

        assertEquals(difference, 15);
    }

    @Test
    public void testSubtractionZeroAndNegativeIsOk() {

        int difference = calculator.subtraction(0, -10);

        assertEquals(difference, 10);
    }

    @Test
    public void testDivisionTwoPositivesIsOk() {

        int result = calculator.divide(25, 5);

        assertEquals(result, 5);
    }
}
