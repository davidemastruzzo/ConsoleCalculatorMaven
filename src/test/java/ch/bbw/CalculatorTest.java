package ch.bbw;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Test Class for {@link Calculator}
 *
 * @author Davide Mastruzzo
 */
public class CalculatorTest {

    @Test
    public void testSumTwoPositivesIsOk() {
        Calculator calculator = new Calculator();

        int sum = calculator.summe(10, 25);

        assertEquals(sum, 35);
    }
}
