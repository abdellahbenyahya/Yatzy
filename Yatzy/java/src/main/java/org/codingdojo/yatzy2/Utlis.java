package org.codingdojo.yatzy2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Utlis {

    static Map<Integer, Long> frequencies(List<Integer> dice) {
        return dice.stream().collect(Collectors.groupingBy(die -> die, Collectors.counting()));
    }
}
