package caluclateage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeConvertDaysTest {
    private Age age;
    @BeforeEach
    public void setup(){
        age = new Age();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenAgeMinusOne_returnMinusOne(){
        int value = age.caluculateAge(-1);
        assertEquals(-1,value);
    }
    @Test
    public void givenAge1_return365(){
        int value = age.caluculateAge(1);
        assertEquals(365,value);
    }

    @Test
    public void givenAge0_return0(){
        int value = age.caluculateAge(0);
        assertEquals(0,value);
    }

    @Test
    public void givenAge10_return3650(){
        int value = age.caluculateAge(-10);
        assertEquals(-1,value);
    }
    @Test
    public void givenAge55_return20075(){
        int value = age.caluculateAge(50);
        assertEquals(18250,value);
    }
}
