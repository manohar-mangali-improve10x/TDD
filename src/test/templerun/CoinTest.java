package templerun;

import org.junit.jupiter.api.Test;

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
}
