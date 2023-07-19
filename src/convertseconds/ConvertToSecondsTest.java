package convertseconds;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertToSecondsTest {
    private HoursToSeconds hoursToSeconds;
    @BeforeEach
    public void setup() {
        hoursToSeconds = new HoursToSeconds();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenMinus1_returnMinus1() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(-1, -1);
        assertEquals(-1, twoHoursAndThreeMinutes);
    }

    @Test
    public void givenZero_returnZero() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(0, 0);
        assertEquals(0, twoHoursAndThreeMinutes);
    }

    @Test
    public void givenOne_returnOne() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(1, 1);
        assertEquals(3660, twoHoursAndThreeMinutes);
    }
    @Test
    public void givenMinus10And10_returnMinus1() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(-10, 10);
        assertEquals(-1, twoHoursAndThreeMinutes);
    }

    @Test
    public void given2HoursAnd10Min_return7800() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(2, 10);
        assertEquals(7800, twoHoursAndThreeMinutes);
    }
}
