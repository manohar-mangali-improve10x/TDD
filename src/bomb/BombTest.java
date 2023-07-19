package bomb;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BombTest {
    private Bomb bomb;
    @BeforeEach
    public void setup(){
        bomb = new Bomb();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenText_returnDuck(){
        String text = bomb.find("there is Bomb");
        assertEquals("Duck",text);
    }

    @Test
    public void givenText_returnManu(){
        String text = bomb.find("");
        assertEquals("",text);
    }

//    @Test
//    public void givenText_returnText(){
//        String text = bomb.find(" ");
//        assertEquals("space",text);
//    }
    @Test
    public void givenNull_returnText(){
        String text = bomb.find(null);
        assertEquals("null",text);
    }
    @Test
    public void givenText_return(){
        String text = bomb.find("Hi good evening to all");
        assertEquals("relax ,there is no bomb",text);
    }
}
