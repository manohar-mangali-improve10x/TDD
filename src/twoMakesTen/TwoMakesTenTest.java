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
        boolean num = numbers.findValue(10,0);
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
        boolean num = numbers.findValue(-1,10);
        assertEquals(true,num);
    }
    @Test
    public void givenMinus5andMinus5_returnTrue(){
        Numbers numbers = new Numbers();
        boolean num = numbers.findValue(-5,-5);
        assertEquals(true,num);
    }
    @Test
    public void givenMinus10and5_returnTrue(){
        Numbers numbers = new Numbers();
        boolean num = numbers.findValue(-10,5);
        assertEquals(true,num);
    }

}
