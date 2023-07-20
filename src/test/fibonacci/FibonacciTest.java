package fibonacci;

import com.improve10x.tdd.fibonacci.Fibonacci;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenNegativeValue_returnNegativeOne() {
        int negativeFibonacci = fibonacci.find(-5);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZero_returnNegativeOne() {
        int negativeFibonacci = fibonacci.find(0);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenOne_returnZero() {
        int zeroFibonacci = fibonacci.find(1);
        assertEquals(0, zeroFibonacci);
    }

    @Test
    public void givenTwo_returnOne() {
        int oneFibonacci = fibonacci.find(2);
        assertEquals(1, oneFibonacci);
    }

    @Test
    public void givenThree_returnOne() {
        int oneFibonacci = fibonacci.find(3);
        assertEquals(1, oneFibonacci);
    }

    @Test
    public void givenFour_returnTwo() {
        int twoFibonacci = fibonacci.find(4);
        assertEquals(2, twoFibonacci);
    }

    @Test
    public void givenSeven_returnEight() {
        int oneFibonacci = fibonacci.find(7);
        assertEquals(8, oneFibonacci);
    }

}
