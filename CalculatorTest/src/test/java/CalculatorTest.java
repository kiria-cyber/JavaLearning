import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        int expected = 20;
        int result =calculator.add(10,10);
        assertEquals(expected,result);
    }
}