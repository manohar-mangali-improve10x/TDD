package tringle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumEdgeOfTringleTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenTwoNumber_return18(){
        Triangle triangle = new Triangle();
        int num = triangle.findMaximumEdgeOfTriangle(10,9);
        assertEquals(18,num);
    }
    @Test
    public void givenTwoNumber_returnMinus1(){
        Triangle triangle = new Triangle();
        int num = triangle.findMaximumEdgeOfTriangle(-1,-1);
        assertEquals(-1,num);
    }
    @Test
    public void givenTwoNumber_returnMinus(){
        Triangle triangle = new Triangle();
        int num = triangle.findMaximumEdgeOfTriangle(0,0);
        assertEquals(-1,num);
    }
    @Test
    public void givenTwoNumber_returnMinusOne(){
        Triangle triangle = new Triangle();
        int num = triangle.findMaximumEdgeOfTriangle(-3,2);
        assertEquals(-1,num);
    }
    @Test
    public void givenTwoNumber_return(){
        Triangle triangle = new Triangle();
        int num = triangle.findMaximumEdgeOfTriangle(6,2);
        assertEquals(7,num);
    }
}
