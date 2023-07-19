package divisiblebyfive;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByFiveTest {
    private Divisible divisible;
    @BeforeEach
    public void setup(){
        divisible = new Divisible();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenTen_returnTrue(){
        boolean result = divisible.findDivisible(-10);
        assertEquals(true,result);
    }
    @Test
    public void givenZero_returnFalse(){
        boolean result = divisible.findDivisible(0);
        assertEquals(true,result);
    }
    @Test
    public void givenMinusOne_returnFalse(){
        boolean result = divisible.findDivisible(-1);
        assertEquals(false,result);
    }
    @Test
    public void givenOne_returnFalse(){
        boolean result = divisible.findDivisible(1);
        assertEquals(false,result);
    }
    @Test
    public void givenFifteen_returnTrue(){
        boolean result = divisible.findDivisible(15);
        assertEquals(true,result);
    }
    @Test
    public void giveFifty_returnTrue(){
        boolean result = divisible.findDivisible(50);
        assertEquals(true,result);
    }
}
