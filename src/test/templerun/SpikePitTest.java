package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenMinusOne_thenThrowsInvalidSpikePitException(){
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(-1),
                "SpikePit width between 0 to 30");
    }
}
