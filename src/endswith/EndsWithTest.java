package endswith;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EndsWithTest {
    @Test
    public void nothing(){

    }
    @Test
    public void givenManoharAnd_Key_ar_returnTrue(){
        EndsWith endsWith = new EndsWith();
        boolean result = endsWith.find("manohar","ar");
        assertEquals(true,result);
    }
    @Test
    public void givenManoharAnd_Key_ra_returnFalse(){
        EndsWith endsWith = new EndsWith();
        boolean result = endsWith.find("manohar","ra");
        assertEquals(false,result);
    }
    @Test
    public void givenManoharAnd_Key_no_returnFalse(){
        EndsWith endsWith = new EndsWith();
        boolean result = endsWith.find("manohar","no");
        assertEquals(false,result);
    }
}
