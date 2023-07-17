package bomb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BombTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenText_returnDuck(){
        Bomb bomb = new Bomb();
        String text = bomb.find("there is Bomb");
        assertEquals("Duck",text);
    }

    @Test
    public void givenText_returnManu(){
        Bomb bomb = new Bomb();
        String text = bomb.find("there is Manohar");
        assertEquals("Manu",text);
    }

    @Test
    public void givenText_returnText(){
        Bomb bomb = new Bomb();
        String text = bomb.find("there is Bom");
        assertEquals("relax ,there is no bomb",text);
    }
}
