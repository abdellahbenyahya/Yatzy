package org.codingdojo.yatzy2;

import java.util.List;
import java.util.Map;

public class OfAKindCategory implements Category {

    private final Integer number;

    public OfAKindCategory(Integer number) {
        this.number = number;
    }

    @Override
    public int score(List<Integer> dice) {
        return score(dice, number, entry -> entry.getValue() >= number, Map.Entry::getKey, Integer::max);
    }
}
