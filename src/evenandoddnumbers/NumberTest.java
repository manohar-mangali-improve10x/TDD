package evenandoddnumbers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberTest {
    @Test
    public void nothing(){

    }
    @Test
    public  void givenTwo_returnsEven(){
        EvenNumber evenNumber = new EvenNumber();
        boolean name = evenNumber.find(2);
        assertEquals(true,name);
    }
    @Test
    public  void givenZero_returnsEven(){
        EvenNumber evenNumber = new EvenNumber();
        boolean name = evenNumber.find(0);
        assertEquals(true,name);
    }
    @Test
    public  void givenTen_returnsEven(){
        EvenNumber evenNumber = new EvenNumber();
        boolean name = evenNumber.find(10);
        assertEquals(true,name);
    }
}
