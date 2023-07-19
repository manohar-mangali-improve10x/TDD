package factorial;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    private Factorial factorial;
    @BeforeEach
    public void setup(){
        factorial = new Factorial();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenFive_return120(){
        int value = factorial.findFactorial(5);
        assertEquals(120,value);
    }
    @Test
    public void given1_return1(){
        int value = factorial.findFactorial(-15);
        assertEquals(-1,value);
    }
    @Test
    public void givenOne_returnOne(){
        int value = factorial.findFactorial(1);
        assertEquals(1,value);
    }
    @Test
    public void givenMinusOne_returnMinusOne(){
        int value = factorial.findFactorial(-1);
        assertEquals(-1,value);
    }
    @Test
    public void givenZero_returnMinusOne(){
        int value = factorial.findFactorial(0);
        assertEquals(-1,value);
    }
    @Test
    public void givenFour_return24(){
        int value = factorial.findFactorial(4);
        assertEquals(24,value);
    }
}
