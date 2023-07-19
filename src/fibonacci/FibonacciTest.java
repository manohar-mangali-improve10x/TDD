package fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    @Test
    public void nothing(){

    }

    @Test
    public void givenNegativeValue_returnNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.find(-5);
        assertEquals(-1,negativeFibonacci);
    }

    @Test
    public void givenZero_returnNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.find(0);
        assertEquals(-1,negativeFibonacci);
    }
}
