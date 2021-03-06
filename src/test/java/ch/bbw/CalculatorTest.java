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
    public void testSubtractionZeroAndPositiveIsOk() {

        int difference = calculator.subtraction(0, 10);

        assertEquals(difference, -10);
    }

    @Test
    public void testSubtractionZeroAndNegativeIsOk() {

        int difference = calculator.subtraction(0, -10);

        assertEquals(difference, 10);
    }

    @Test
    public void testSubtractionTwoZerosIsOk() {

        int difference = calculator.subtraction(0, 0);

        assertEquals(difference, 0);
    }

    @Test
    public void testSubtractionTwoPositivesEqualMIN_VALUE() {

        int difference = calculator.subtraction(100, Integer.MIN_VALUE + 100);

        assertEquals(difference, Integer.MIN_VALUE);
    }

    @Test
    public void testSubtractionMAX_VALUEAndMIN_VALUEIsOk() {

        int difference = calculator.subtraction(Integer.MAX_VALUE, Integer.MIN_VALUE);

        assertEquals(difference, -1);
    }

    @Test
    public void testDivisionTwoPositivesIsOk() {

        int result = calculator.divide(25, 5);

        assertEquals(result, 5);
    }

    @Test
    public void testDivisionPositiveAndNegativeIsOk() {

        int result = calculator.divide(25, -5);

        assertEquals(result, -5);
    }

    @Test
    public void testDivisionNegativeAndPositiveIsOk() {

        int result = calculator.divide(-25, 5);

        assertEquals(result, -5);
    }

    @Test
    public void testDivisionZeroAndPositiveIsOk() {

        int result = calculator.divide(0, 25);

        assertEquals(result, 0);
    }

    @Test
    public void testDivisionZeroAndNegativeIsOk() {

        int result = calculator.divide(0, -25);

        assertEquals(result, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroAndZeroIsOk() {

        int result = calculator.divide(0, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPositiveAndZeroShouldFail() {

        int result = calculator.divide(10, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionNegativeAndZeroShouldFail() {

        int result = calculator.divide(-10, 0);
    }
}
