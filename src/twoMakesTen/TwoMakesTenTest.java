package twoMakesTen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoMakesTenTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenATen_return(){
        Numbers numbers = new Numbers();
        boolean num = numbers.findValue(10,5);
        assertEquals(true,num);
    }
    @Test
    public void givenABSumTen_returnTrue(){
        Numbers numbers = new Numbers();
        boolean num = numbers.findValue(5,5);
        assertEquals(true,num);
    }

    @Test
    public void givenBTen_return(){
        Numbers numbers = new Numbers();
        boolean num = numbers.findValue(2,10);
        assertEquals(true,num);
    }
}
