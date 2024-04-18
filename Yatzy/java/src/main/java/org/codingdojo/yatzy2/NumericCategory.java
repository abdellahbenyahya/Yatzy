package org.codingdojo.yatzy2;

import java.util.List;
import java.util.Objects;

public class NumericCategory implements Category {

    private final Integer number;

    public NumericCategory(Integer number) {
        this.number = number;
    }

    @Override
    public int score(List<Integer> dice) {
        return score(dice, number, entry -> Objects.equals(entry.getKey(), number), entry -> entry.getValue().intValue(), Integer::sum);
    }
}
