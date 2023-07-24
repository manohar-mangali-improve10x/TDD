package templerun;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerTest {
    private ByteArrayOutputStream outputStream;
    @BeforeEach
    public void setup(){
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

    }
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
    @Test
    public void givenHealth101_thenThrowsInvalidHealthException(){
        assertThrows(Player.InvalidHealthException.class,
                () -> new Player("name",101),
                "Health should be between 0 to 100");
    }

    @Test
    public void givenHealth100_whenGetHealthCalled_thenReturn100(){
        Player player = new Player("name",100);
        assertEquals(100,player.getHealth());
    }

    @Test
    public void givenHealth90_whenGetHealthCalled_thenReturn90(){
        Player player = new Player("name",90);
        assertEquals(90,player.getHealth());
    }
    @Test
    public void whenRunCalled_displayRunningMessage(){
        Player player = new Player("name",100);
        player.run();
        assertEquals("Running...!",outputStream.toString().trim());
    }
    @Test
    public void whenGetScoreCalled_thenReturn0(){
        Player player = new Player("name");
        assertEquals(0,player.getScore());
    }

    @Test
    public void givenCoin10_whenGetScoreCalled_thenReturn10(){
        Player player = new Player("name");
        player.collectCoin(new Coin(10));
        assertEquals(10,player.getScore());
    }
    @Test
    public void givenCoins10And20_whenGetScoreCalled_thenReturn30(){
        Player player = new Player("name");
        player.collectCoin(new Coin(10));
        player.collectCoin(new Coin(20));
        assertEquals(30,player.getScore());
    }

    @Test
    public void whenJumpCalled_displayJumpingMessage(){
        Player player = new Player("Name");
        player.jump();
        assertEquals("Name jump to avoid obstacle",outputStream.toString().trim());
    }



}
