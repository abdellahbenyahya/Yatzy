package org.codingdojo.yatzy2;

import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class PairsCategory implements Category {

    private Integer number;

    private final Predicate<Map.Entry<Integer, Long>> predicate = entry -> entry.getValue() >= 2 && entry.getValue() <= (number > 1 ? 3 : 5);
    private final Function<Map.Entry<Integer, Long>, Integer> function = Map.Entry::getKey;
    private final BinaryOperator<Integer> reduce;

    public PairsCategory(Integer number) {
        this.number = number;
        reduce = 1 < number ? Integer::sum : Integer::max;
    }

    @Override
    public int score(List<Integer> dice) {
        return score(dice, 2, predicate, function, reduce);
    }
}
