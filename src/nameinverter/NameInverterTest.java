package nameinverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NameInverterTest {
    private  NameInverter nameInverter;
    @BeforeEach
    public void setup(){
        nameInverter = new NameInverter();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenEmpty_returnEmpty(){
        String inverterName = nameInverter.invertName("");
        assertEquals("",inverterName);
    }
   @Test
    public void givenSingleWord_returnSingleWord(){
        String inverterName = nameInverter.invertName("name");
        assertEquals("name",inverterName);
    }
    @Test
    public void givenSingleWordWithBeginningSpace_returnSingleWord(){
        String inverterName = nameInverter.invertName("   name   ");
        assertEquals("name",inverterName);
    }
    @Test
    public void givenSingleWordTrailingSpace_returnSingleWord(){
        String inverterName = nameInverter.invertName("name  ");
        assertEquals("name",inverterName);
    }
    @Test
    public void givenFirstAndLast_returnInverterName(){
        String inverterName = nameInverter.invertName("first last");
        assertEquals("last, first",inverterName);
    }
    @Test
    public void givenHonorifics_ignoreHonorifics(){
        String inverterName = nameInverter.invertName("Mrs. first last");
        assertEquals("last, first",inverterName);
    }
    @Test
    public void givenPostNominal_stayEnd(){
        String inverterName = nameInverter.invertName("first last MSc.");
        assertEquals("last, first MSc.",inverterName);
    }
    @Test
    public void givenMultiPostNominal_stayEnd(){
        String inverterName = nameInverter.invertName("first last MSc. PhD.");
        assertEquals("last, first MSc. PhD.",inverterName);
    }
}
