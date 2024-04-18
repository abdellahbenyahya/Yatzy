package org.codingdojo;

import org.codingdojo.yatzy2.Category;
import org.codingdojo.yatzy2.ChanceCategory;
import org.codingdojo.yatzy2.FullHouseCategory;
import org.codingdojo.yatzy2.LargeStraightCategory;
import org.codingdojo.yatzy2.NumericCategory;
import org.codingdojo.yatzy2.OfAKindCategory;
import org.codingdojo.yatzy2.PairsCategory;
import org.codingdojo.yatzy2.SmallStraightCategory;
import org.codingdojo.yatzy2.YATZYCategory;

public enum YatzyCategory {

    CHANCE (new ChanceCategory()),
    YATZY(new YATZYCategory()),
    ONES(new NumericCategory(1)),
    TWOS(new NumericCategory(2)),
    THREES(new NumericCategory(3)),
    FOURS(new NumericCategory(4)),
    FIVES(new NumericCategory(5)),
    SIXES(new NumericCategory(6)),
    PAIR(new PairsCategory(1)),
    TWO_PAIRS(new PairsCategory(2)),
    THREE_OF_A_KIND(new OfAKindCategory(3)),
    FOUR_OF_A_KIND(new OfAKindCategory(4)),
    SMALL_STRAIGHT(new SmallStraightCategory()),
    LARGE_STRAIGHT(new LargeStraightCategory()),
    FULL_HOUSE(new FullHouseCategory());

    private final Category category;

    YatzyCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

}
