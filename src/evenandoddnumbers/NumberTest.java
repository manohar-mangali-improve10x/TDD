package evenandoddnumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {
    private EvenNumber evenNumber;
    @BeforeEach
    public void setup(){
        evenNumber = new EvenNumber();
    }
    @Test
    public void nothing(){

    }
    @Test
    public  void givenTwo_returnsEven(){
        boolean name = evenNumber.find(2);
        assertEquals(true,name);
    }
    @Test
    public  void givenZero_returnsEven(){
        boolean name = evenNumber.find(0);
        assertEquals(true,name);
    }
    @Test
    public  void givenMinusOne_returnsFalse(){
        boolean name = evenNumber.find(-1);
        assertEquals(false,name);
    }

    @Test
    public  void given99_returnFalse(){
        boolean name = evenNumber.find(99);
        assertEquals(false,name);
    }
    @Test
    public  void givenNegative_returnTrue(){
        boolean name = evenNumber.find(-100);
        assertEquals(true,name);
    }
}
