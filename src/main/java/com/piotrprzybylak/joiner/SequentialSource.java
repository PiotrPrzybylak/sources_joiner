package com.piotrprzybylak.joiner;

public class SequentialSource implements Source<Integer> {

    private int current;

    @Override
    public Integer generate() {
        return current++;
    }
}
