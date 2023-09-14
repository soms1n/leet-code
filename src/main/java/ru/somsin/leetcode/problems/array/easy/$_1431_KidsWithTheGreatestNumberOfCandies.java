package ru.somsin.leetcode.problems.array.easy;

import java.util.ArrayList;
import java.util.List;

public class $_1431_KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }

        return result;
    }
}
