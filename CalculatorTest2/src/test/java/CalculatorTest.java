import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void whenAddTenToFiveThenResultFifteen() {
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void whenAdd10To5AssStringThenResult15() {
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void whenInputIncorrectValueThenThrowException() {
        boolean wasException = false;
        try {
            calculator.add("asdasdada", "10");
        } catch (Exception e) {
            wasException = true;
        }
        assertTrue(wasException);
    }

    @Test(expected = NumberFormatException.class)
    public void whenInputIncorrectValueThenThrowException2() {
        calculator.add("!#$!$!$sdf", "10");
    }

    @Test
    public void whenMultiplyTenToTwoThenResultTwenty() {
        double expected = 20;
        double result = calculator.multiply(10, 2);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void whenMultiply15To3AssStringThenResult45() {
        double expected = 45;
        double result = calculator.multiply("15", "3");
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void whenDivideFortyToTwoThenResultTwenty() {
        double expected = 20;
        double result = calculator.divide(40, 2);
        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void whenDivide60To2ThenResult30() {
        double expected = 30;
        double result = calculator.divide("60", "2");
        assertEquals(expected, result, 0.0001);
    }

    @Test(expected = NumberFormatException.class)
    public void whenInputIncorrectValueForDivide() {
        calculator.divide("20", "ADS");
    }

    @Test
    public void whenSquareTwoThenResultTwenty() {
        double expected = 4;
        double result = calculator.square(2);
        assertEquals(expected, result, 0.0001);
    }
    @Test
    public void whenSquare4ThenResult16() {
        double expected = 16;
        double result = calculator.square("4");
        assertEquals(expected, result, 0.0001);
    }
    @Test(expected = NumberFormatException.class)
    public void whenInputIncorrectValueForSquare() {
        calculator.square("asd");
    }

    @After
    public void close() {
        calculator = null;

    }
}