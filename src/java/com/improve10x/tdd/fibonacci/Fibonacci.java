package com.improve10x.tdd.fibonacci;

public class Fibonacci {
    public int find(int number) {
        if (number <= 0) {
            return -1;
        } else if (number == 1 || number == 2) {
            return number - 1;
        } else {
            return find(number - 1) + find(number - 2);
        }
    }
}
