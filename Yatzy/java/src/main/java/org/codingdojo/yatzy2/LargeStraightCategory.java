package org.codingdojo.yatzy2;

import java.util.List;

import static org.codingdojo.yatzy2.Constants.DICE_VALUES;

public class LargeStraightCategory implements Category {

    public LargeStraightCategory() {
    }

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().sorted().toList().equals(DICE_VALUES.subList(1, 6))
            ? 20
            : 0;
    }
}
