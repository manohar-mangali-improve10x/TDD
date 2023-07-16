package sumislessthan100;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenTwoAndThree_returnTrue(){
        Sum sum = new Sum();
        boolean result =  sum.find(2,3);
        assertEquals(true,result);
    }
    @Test
    public void givenZeroAndThree_returnTrue(){
        Sum sum = new Sum();
        boolean result =  sum.find(0,3);
        assertEquals(true,result);
    }
    @Test
    public void given19and20_returnTrue(){
        Sum sum = new Sum();
        boolean result =  sum.find(19,20);
        assertEquals(true,result);
    }
    @Test
    public void given50And50_returnTrue(){
        Sum sum = new Sum();
        boolean result =  sum.find(50,50);
        assertEquals(true,result);
    }

    @Test
    public void givenTwoBigNumbers_returnFalse(){
        Sum sum = new Sum();
        boolean result =  sum.find(110,90);
        assertEquals(false,result);
    }
}
