package com.piotrprzybylak.joiner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int howMany = 1;
        if (args.length > 0) {
            try {
                howMany = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Usage: java Main [number of iterations]");
                System.exit(1);
            }
        }

        Joiner<Integer> joiner = new Joiner<>(Arrays.asList(new RandomSource(), new SequentialSource()), new AdditionJoinStrategy());
        for (int i = 0; i < howMany; i++) {
            System.out.println(joiner.joinNext());
        }
    }
}
