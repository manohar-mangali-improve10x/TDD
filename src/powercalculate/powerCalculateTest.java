package powercalculate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class powerCalculateTest {
    private Power power;
    @BeforeEach
    public void setup(){
        power = new Power();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenNumbers_returnValue(){
        int value = power.find(0,0);
        assertEquals(0,value);
    }
    @Test
    public void givenNumbersIs110and3_returnValue(){
        int value = power.find(-1,-1);
        assertEquals(1,value);
    }
    @Test
    public void givenOne_returnOne(){
        int value = power.find(1,1);
        assertEquals(1,value);
    }
    @Test
    public void givenNumbersMinus1And10_returnMinus1(){
        int value = power.find(-5,10);
        assertEquals(-1,value);
    }
    @Test
    public void givenNumbers5And10_return50(){
        int value = power.find(5,10);
        assertEquals(50,value);
    }
}
