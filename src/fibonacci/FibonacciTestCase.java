package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTestCase {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNegative(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.find(-10);
        assertEquals(-1,negativeFibonacci);

    }
    @Test
    public void givenZero_returnNegativeNumber(){
        Fibonacci fibonacci = new Fibonacci();
        int zeroFibonacci = fibonacci.find(0);
        assertEquals(-1,zeroFibonacci);
    }
    @Test
    public void givenOne_returnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int oneFibonacci = fibonacci.find(1);
        assertEquals(0,oneFibonacci);
    }
    @Test
    public void givenTwo_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int twoFibonacci = fibonacci.find(2);
        assertEquals(1,twoFibonacci);
    }
    @Test
    public void givenThree_returnOne(){
        Fibonacci fibonacci = new Fibonacci();
        int threeFibonacci = fibonacci.find(3);
        assertEquals(1,threeFibonacci);
    }
    @Test
    public void givenFive_returnThree(){
        Fibonacci fibonacci = new Fibonacci();
        int fiveFibonacci = fibonacci.find(5);
        assertEquals(3,fiveFibonacci);
    }
}
