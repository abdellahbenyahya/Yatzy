package org.codingdojo.yatzy2;

import org.codingdojo.YatzyCategory;

import java.util.List;

public class Yatzy implements YatzyCalculator {

    @Override
    public int score(List<Integer> dice, String categoryName) {
        return YatzyCategory.valueOf(categoryName).getCategory().score(dice);
    }

}
