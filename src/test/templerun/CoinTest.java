package templerun;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoinTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenMinusOne_thenThrowsInvalidCoinException(){
        assertThrows(Coin.InvalidCoinValueException.class,
                () -> new Coin(-1),
                "Coin value should be between 0 to 100");
    }
    @Test
    public void given101_thenThrowsInvalidCoinException(){
        assertThrows(Coin.InvalidCoinValueException.class,
                () -> new Coin(-101),
                "Coin value should be between 0 to 100");
    }

    @Test
    public void given10_whenGetValueCalled_return10(){
        assertEquals(10,new Coin(10).getValue());
    }
}
