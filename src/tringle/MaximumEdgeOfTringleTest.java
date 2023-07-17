package tringle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumEdgeOfTringleTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenTwoNumber_return(){
        Triangle triangle = new Triangle();
        int num = triangle.findMaximum(10,9);
        assertEquals(18,num);
    }
}
