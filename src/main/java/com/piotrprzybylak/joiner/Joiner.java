package com.piotrprzybylak.joiner;

import java.util.ArrayList;
import java.util.List;

public class Joiner<T> {
    private List<Source<T>> sources;
    private JoinStrategy<T> strategy;

    public Joiner(List<Source<T>> sources, JoinStrategy<T> strategy) {
        this.sources = sources;
        this.strategy = strategy;
    }

    public T joinNext() {
        List<T> items = new ArrayList<>();
        for (Source<T> source:sources) {
            T item = source.generate();
            items.add(item);
        }
        return strategy.join(items);
    }
}
