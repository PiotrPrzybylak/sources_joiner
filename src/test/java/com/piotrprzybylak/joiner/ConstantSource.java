package com.piotrprzybylak.joiner;

public class ConstantSource implements Source<Integer> {

    private int value;

    public ConstantSource(int value) {
        this.value = value;
    }

    @Override
    public Integer generate() {
        return value;
    }
}
