package com.piotrprzybylak.joiner;

import java.util.Random;

public class RandomSource implements Source<Integer> {

    private Random random = new Random();

    @Override
    public Integer generate() {
        return random.nextInt();
    }
}
