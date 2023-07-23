package com.improve10x.tdd.bowling;

public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll] = pins;
        currentRoll++;
    }

    public int score() {
        int totalPins = 0;
        int firstInFrame = 0;
        for (int frame = 0;frame<10;frame++){
            if (isSpare(firstInFrame)) {
                totalPins += 10 + firstInNextFrame(firstInFrame + 2);
                firstInFrame += 2;
            }else {
                totalPins += rolls[firstInFrame] + rolls[firstInFrame + 1];
                firstInFrame += 2;
            }
        }
        return totalPins;
    }

    private int firstInNextFrame(int firstInFrame) {
        return rolls[firstInFrame];
    }

    private boolean isSpare(int firstInFrame) {
        return rolls[firstInFrame] + rolls[firstInFrame + 1] == 10;
    }
}
