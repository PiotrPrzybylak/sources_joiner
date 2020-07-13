package com.piotrprzybylak.joiner;

import java.util.List;

public interface JoinStrategy<T> {
    T join(List<T> items);
}
