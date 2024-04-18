package org.codingdojo.yatzy2;

import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public interface Category {
    default int score(List<Integer> dice, Integer number, Predicate<Map.Entry<Integer, Long>> predicate, Function<Map.Entry<Integer, Long>, Integer> map, BinaryOperator<Integer> reduce) {
        return Utlis.frequencies(dice)
            .entrySet()
            .stream()
            .filter(predicate)
            .map(map)
            .reduce(reduce)
            .orElse(0) * number;
    }

    int score(List<Integer> dice);
}
