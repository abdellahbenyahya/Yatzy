package org.codingdojo.yatzy2;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FullHouseCategory implements Category {

    public FullHouseCategory() {
    }

    @Override
    public int score(List<Integer> dice) {
        int twoOfKind = score(dice, 2, entry -> Objects.equals(entry.getValue().intValue(), 2), Map.Entry::getKey, Integer::sum);
        int threeOfKind = score(dice, 3, entry -> Objects.equals(entry.getValue().intValue(), 3), Map.Entry::getKey, Integer::sum);
        return twoOfKind > 0 && threeOfKind > 0 ? twoOfKind + threeOfKind : 0;
    }
}
