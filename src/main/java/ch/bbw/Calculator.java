package ch.bbw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Calculator
 * - kann  zwei Zahlen addieren
 *
 * @author Davide Mastruzzo
 */
public class Calculator {

    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    protected int subtraction(int value1, int value2) {
        return value1 - value2;
    }

    int divide(int value1, int value2) {
        return value1 / value2;
    }

    private int multiply(int value1, int value2) {
        return value1 * value2;
    }

    /**
     * The multiply method is private. In order to test it, the tests have to be in the same class.
     */
    @Test
    void testMultiplicationTwoPositivesIsOk() {

        Calculator calculator = new Calculator();

        int result = calculator.multiply(10, 5);

        assertEquals(result, 50);
    }
}