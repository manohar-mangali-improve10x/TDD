package powercalculate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class powerCalculateTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNumbers_returnValue(){
        Power power = new Power();
        int value = power.find(550,20);
        assertEquals(11000,value);
    }
    @Test
    public void givenNumbersIs110and3_returnValue(){
        Power power = new Power();
        int value = power.find(110,3);
        assertEquals(330,value);
    }
    @Test
    public void givenNumbersIs480and20_returnValue(){
        Power power = new Power();
        int value = power.find(480,20);
        assertEquals(9600,value);
    }
}
