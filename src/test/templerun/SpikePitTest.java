package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpikePitTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenWidthMinusOne_thenThrowsInvalidSpikePitException(){
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(-1),
                "SpikePit width between 0 to 30");
    }

    @Test
    public void givenWidth31_thenThrowsInvalidSpikePitException(){
        assertThrows(SpikePit.InvalidSpikePitException.class,
                () -> new SpikePit(31),
                "SpikePit width between 0 to 30");
    }
    @Test
    public void givenWidth20_thenGetWidthCalled_return20(){
        assertEquals(20,new SpikePit(20).getWidth());
    }
}
