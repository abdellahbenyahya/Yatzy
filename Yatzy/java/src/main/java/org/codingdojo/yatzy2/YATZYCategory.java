package org.codingdojo.yatzy2;

import java.util.List;

public class YATZYCategory implements Category {

    public YATZYCategory() {
    }

    @Override
    public int score(List<Integer> dice) {
        return dice.stream().distinct().count() == 1 ? 50 : 0;
    }
}
