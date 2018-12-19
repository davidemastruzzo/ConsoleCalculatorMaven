package ch.bbw;

/**
 * Calculator
 * - kann  zwei Zahlen addieren
 *
 * @author Davide Mastruzzo
 */
public class Calculator {

    public int summe(int summand1, int summand2) {
        return summand1 + summand2;
    }

    protected int subtraction(int value1, int value2) {
        return value1 - value2;
    }

    public int divide(int value1, int value2) {
        return value1 / value2;
    }
}
