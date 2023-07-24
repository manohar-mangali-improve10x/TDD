package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenNameNull_whenGetNameCalled_theReturnEmpty(){
     Player player = new Player(null);
        assertEquals("",player.getName());
    }

    @Test
    public void givenNameEmpty_whenGetNameCalled_theReturnEmpty(){
        Player player = new Player("");
        assertEquals("",player.getName());
    }

    @Test
    public void givenNameExplorer_whenGetNameCalled_theReturnExplorer(){
        Player player = new Player("Explorer");
        assertEquals("Explorer",player.getName());
    }
    @Test
    public void givenNameExplorerWithSpace_whenGetNameCalled_returnExplorer(){
        Player player = new Player(" Explorer   ");
        assertEquals("Explorer",player.getName());
    }
}
