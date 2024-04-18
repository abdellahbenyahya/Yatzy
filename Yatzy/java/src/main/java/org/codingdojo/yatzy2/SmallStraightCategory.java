package org.codingdojo.yatzy2;

import java.util.List;

import static org.codingdojo.yatzy2.Constants.DICE_VALUES;

public class SmallStraightCategory implements Category {

    public SmallStraightCategory() {
    }

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().sorted().toList().equals(DICE_VALUES.subList(0, 5))
            ? 15
            : 0;
    }
}
