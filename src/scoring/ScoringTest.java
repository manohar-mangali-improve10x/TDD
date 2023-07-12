package scoring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ScoringTest {
    private Scoring scoring;
    @BeforeEach
    public void setUp(){
        scoring = new Scoring();

    }
    @Test
    public void nothing(){

    }
    @Test
    public void givenEmpty_returnNull(){
        int[] score = scoring.caluculateScore(null);
        assertArrayEquals(new int[3],score);
    }
    @Test
    public void givenA_returnOneZeroZero(){
        int[] onlyAScore = scoring.caluculateScore("A");
        assertArrayEquals(new int[]{1,0,0},onlyAScore);
    }
    @Test
    public void givenB_returnZeroOneZero(){
        int[] onlyBScore = scoring.caluculateScore("B");
        assertArrayEquals(new int[]{0,1,0},onlyBScore);
    }
    @Test
    public void givenC_returnZeroZeroOne(){
        int[] onlyCScore = scoring.caluculateScore("C");
        assertArrayEquals(new int[]{0,0,1},onlyCScore);
    }
    @Test
    public void givenAB_returnOneOneZero(){
        int[] onlyABScore = scoring.caluculateScore("AB");
        assertArrayEquals(new int[]{1,1,0},onlyABScore);
    }
    @Test
    public void givenABBCCCCCBA_returnTwoThreeFive(){
        int[] onlyABBCCCCCBAScore = scoring.caluculateScore("ABBCCCCCBA");
        assertArrayEquals(new int[]{1,0,0},onlyABBCCCCCBAScore);
    }

}
