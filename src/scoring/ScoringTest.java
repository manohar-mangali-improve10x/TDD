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

    @Test
    public void givenA_returnOneZeroZero(){
        int[] onlyAScore = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1,0,0},onlyAScore);
    }

    @Test
    public void givenB_returnZeroOneZero(){
        int[] onlyBScore = scoring.calculateScores("B");
        assertArrayEquals(new int[] {0,1,0},onlyBScore);
    }

    @Test
    public void givenC_returnZeroZeroOne(){
        int[] onlyCScore = scoring.calculateScores("C");
        assertArrayEquals(new int[] {0,0,1},onlyCScore);
    }
    @Test
    public void givenAB_returnOneOneZero(){
        int[] onlyABScore = scoring.calculateScores("AB");
        assertArrayEquals(new int[] {1,1,0},onlyABScore);
    }

    @Test
    public void givenABC_returnOneOnOne(){
        int[] onlyABCScore = scoring.calculateScores("ABC");
        assertArrayEquals(new int[] {1,1,1},onlyABCScore);
    }

}
