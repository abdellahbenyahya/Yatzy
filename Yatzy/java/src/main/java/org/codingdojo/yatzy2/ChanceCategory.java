package org.codingdojo.yatzy2;

import java.util.List;

public class ChanceCategory implements Category {

    public ChanceCategory() {
    }

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().mapToInt(Integer::intValue).sum();
    }
}
