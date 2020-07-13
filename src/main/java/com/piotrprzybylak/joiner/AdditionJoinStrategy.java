package com.piotrprzybylak.joiner;

import java.util.List;

public class AdditionJoinStrategy implements JoinStrategy<Integer> {
    @Override
    public Integer join(List<Integer> items) {
        return items.stream().mapToInt(Integer::intValue).sum();
    }
}
