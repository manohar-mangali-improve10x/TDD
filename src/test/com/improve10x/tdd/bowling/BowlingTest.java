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
    @Test
    public void oneSpare(){
        game.roll(5);
        game.roll(5);
        game.roll(4);
        rollMany(17,0);
        assertEquals(18,game.score());
    }

    @Test
    public void oneStrike(){
        game.roll(10);
        game.roll(4);
        game.roll(2);
        rollMany(16,0);
        assertEquals(22,game.score());
    }
    @Test
    public void scoreBoard(){
        game.roll(7);
        game.roll(2);
        game.roll(10);
        game.roll(6);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(8);
        game.roll(1);
        game.roll(2);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(3);
        game.roll(3);
        game.roll(4);
        game.roll(2);
        game.roll(5);
        game.roll(5);
        game.roll(2);
        assertEquals(98,game.score());
    }
}
