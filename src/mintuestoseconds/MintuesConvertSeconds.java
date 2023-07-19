package mintuestoseconds;

import convertseconds.HoursToSeconds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MintuesConvertSeconds {
    private MintuesToSeconds mintuesToSeconds;
    @BeforeEach
    public void setup() {
        mintuesToSeconds = new MintuesToSeconds();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenMinutes1_returnMinutes1() {
        int twoHoursAndThreeMinutes = mintuesToSeconds.findSeconds(-1);
        assertEquals(-1, twoHoursAndThreeMinutes);
    }
    @Test
    public void givenZero_returnZero() {
        int twoHoursAndThreeMinutes = mintuesToSeconds.findSeconds(0);
        assertEquals(0, twoHoursAndThreeMinutes);
    }
    @Test
    public void given1Minutes_return60Seconds() {
        int twoHoursAndThreeMinutes = mintuesToSeconds.findSeconds(1);
        assertEquals(60, twoHoursAndThreeMinutes);
    }

    @Test
    public void given60Minutes_return3600Seconds() {
        int twoHoursAndThreeMinutes = mintuesToSeconds.findSeconds(60);
        assertEquals(3600, twoHoursAndThreeMinutes);
    }

    @Test
    public void givenFiveMinutes_return300Seconds() {
        int twoHoursAndThreeMinutes = mintuesToSeconds.findSeconds(5);
        assertEquals(300, twoHoursAndThreeMinutes);
    }
}
