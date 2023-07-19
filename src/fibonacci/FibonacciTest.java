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

    @Test
    public void givenOne_returnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int zeroFibonacci = fibonacci.find(1);
        assertEquals(0,zeroFibonacci);
    }

    @Test
    public void givenTwo_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int oneFibonacci = fibonacci.find(2);
        assertEquals(1,oneFibonacci);
    }

}
