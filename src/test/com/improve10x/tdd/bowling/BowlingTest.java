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
        for (int i = 0;i<20;i++){
            game.roll(0);
        }
        assertEquals(0,game.score());
    }

    @Test
    public void allOnes(){
        for (int i = 0;i<20;i++){
            game.roll(1);
        }
        assertEquals(20,game.score());
    }
}
