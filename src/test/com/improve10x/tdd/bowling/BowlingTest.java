package com.improve10x.tdd.bowling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private Game game;
    @BeforeEach
    public void setup(){
        game = new Game();
    }
    @Test
    public void nothing(){

    }
    @Test
    public void canRoll(){
        game.roll(1);
    }
    @Test
    public void gutterGame(){
        rollMany(20, 0);
        assertEquals(0,game.score());
    }

    private void rollMany(int noOfRolls, int pins) {
        for (int i = 0; i< noOfRolls; i++){
            game.roll(pins);
        }
    }

    @Test
    public void allOnes(){
        rollMany(20, 1);
        assertEquals(20,game.score());
    }
}
