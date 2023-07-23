package com.improve10x.tdd.bowling;

import org.junit.jupiter.api.Test;

public class BowlingTest {
    @Test
    public void nothing(){

    }
    @Test
    public void canRoll(){
        Game game = new Game();
        game.roll(1);
    }
}
