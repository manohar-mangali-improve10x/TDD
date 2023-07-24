package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNameNull_whenGetNameCalled_thenReturnEmpty(){
     Player player = new Player(null);
        assertEquals("",player.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_thenReturnEmpty(){
        Player player = new Player("");
        assertEquals("",player.getName());
    }

    @Test
    public void givenNameExplorer_whenGetNameCalled_thenReturnExplorer(){
        Player player = new Player("Explorer");
        assertEquals("Explorer",player.getName());
    }
    @Test
    public void givenNameExplorerWithSpace_whenGetNameCalled_thenReturnExplorer(){
        Player player = new Player(" Explorer   ");
        assertEquals("Explorer",player.getName());
    }

    @Test
    public void givenNoHealth_whenGetHealthCalled_thenReturn100(){
        Player player = new Player("name");
        assertEquals(100,player.getHealth());
    }
    @Test
    public void givenHealthMinusOne_thenThrowsInvalidHealthException(){
        assertThrows(Player.InvalidHealthException.class,
                () -> new Player("name",-1),
                "Health should be between 0 to 100");

    }
}
