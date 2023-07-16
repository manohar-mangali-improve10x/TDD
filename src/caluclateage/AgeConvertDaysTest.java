package caluclateage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeConvertDaysTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenAge55_return20075(){
        Age age = new Age();
        int value = age.find(55);
        assertEquals(20075,value);
    }

    @Test
    public void givenAge1_return365(){
        Age age = new Age();
        int value = age.find(1);
        assertEquals(365,value);
    }

    @Test
    public void givenAge0_return0(){
        Age age = new Age();
        int value = age.find(0);
        assertEquals(0,value);
    }

    @Test
    public void givenAge10_return3650(){
        Age age = new Age();
        int value = age.find(-10);
        assertEquals(-1,value);
    }
}
