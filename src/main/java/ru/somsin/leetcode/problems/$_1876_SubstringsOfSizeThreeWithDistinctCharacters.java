package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_1876_SubstringsOfSizeThreeWithDistinctCharacters {
    public int countGoodSubstrings(String s) {
        Map<Character, Integer> counter = new HashMap<>();

        int left = 0, right = 0, result = 0;

        while (right < s.length()) {
            counter.put(s.charAt(right), counter.getOrDefault(s.charAt(right), 0) + 1);

            right++;

            if (right - left == 3) {
                if (counter.size() == 3) {
                    result++;
                }

                char charLeft = s.charAt(left);

                int numbersLeft = counter.get(charLeft) - 1;
                if (numbersLeft == 0) {
                    counter.remove(charLeft);
                } else {
                    counter.put(charLeft, numbersLeft);
                }

                left++;
            }
        }

        return result;
    }
}
