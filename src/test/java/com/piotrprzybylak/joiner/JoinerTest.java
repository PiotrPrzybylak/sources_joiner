package com.piotrprzybylak.joiner;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JoinerTest {

    @Test
    public void testShouldReturnSumOfAllSources() {
        // Given
        Joiner<Integer> joiner = new Joiner<>(Arrays.asList(
                new ConstantSource(1),
                new ConstantSource(2),
                new ConstantSource(3)),
                new AdditionJoinStrategy());

        // When
        Integer result = joiner.joinNext();

        // Then
        assertEquals(6, result);
    }
}