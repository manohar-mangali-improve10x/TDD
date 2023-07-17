package recursion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {
    @Test
    public void nothing(){

    }
    @Test
    public void giveFive_return15(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(5);
        assertEquals(15,value);
    }
    @Test
    public void give2_return3(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(2);
        assertEquals(3,value);
    }

    @Test
    public void give8_return36(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(8);
        assertEquals(36,value);
    }
    @Test
    public void give4_return10(){
        Recursion recursion = new Recursion();
        int value = recursion.calculate(4);
        assertEquals(10,value);
    }
}
