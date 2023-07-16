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
    public void givenTwoHoursAndThreeMinutes_return7380Seconds() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(2, 3);
        assertEquals(7380, twoHoursAndThreeMinutes);
    }

    @Test
    public void givenTwoHoursAndZeroMinutes_return7200Seconds() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(2, 0);
        assertEquals(7200, twoHoursAndThreeMinutes);
    }

    @Test
    public void givenZeroHoursAndZeroMinutes_return7380Seconds() {
        int twoHoursAndThreeMinutes = hoursToSeconds.findSeconds(0, 0);
        assertEquals(0, twoHoursAndThreeMinutes);
    }
}
