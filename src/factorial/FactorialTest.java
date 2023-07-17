package factorial;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenFive_return120(){
        Factorial factorial = new Factorial();
        int value = factorial.find(5);
        assertEquals(120,value);
    }
    @Test
    public void given1_return1(){
        Factorial factorial = new Factorial();
        int value = factorial.find(1);
        assertEquals(1,value);
    }
    @Test
    public void given0_return0(){
        Factorial factorial = new Factorial();
        int value = factorial.find(0);
        assertEquals(0,value);
    }
    @Test
    public void givenFour_return24(){
        Factorial factorial = new Factorial();
        int value = factorial.find(5);
        assertEquals(120,value);
    }
}
