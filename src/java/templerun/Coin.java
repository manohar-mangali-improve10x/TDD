package templerun;

public class Coin {

    public Coin(int value) {
        if (value < 0 || value > 100) {
            throw new InvalidCoinValueException();
        }
    }

    public int getValue() {
        return 10;
    }

    public class InvalidCoinValueException extends RuntimeException {
    }
}
