package scoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {
    private Scoring scoring;
    @BeforeEach
    public void setup(){
        scoring = new Scoring();
    }
    @Test
    public void nothing(){

    }

    @Test
    public void givenNull_returnAllZeros(){
      int[] allZeros = scoring.calculateScores(null);
      assertArrayEquals(new int[3],allZeros);
    }

    @Test
    public void givenEmpty_returnAllZeros(){
        int[] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3],allZeros);
    }
}
