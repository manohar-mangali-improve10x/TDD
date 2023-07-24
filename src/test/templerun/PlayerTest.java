package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNameNull_whenGetNameCalled_returnEmpty(){
     Player player = new Player(null);
        assertEquals("",player.getName());
    }
}
