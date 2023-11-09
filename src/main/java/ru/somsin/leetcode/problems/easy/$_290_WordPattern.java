package ru.somsin.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class $_290_WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Map<String, Character> inverseMap = new HashMap<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char patternChar = pattern.charAt(i);
            String word = words[i];
            String wordMap = map.get(patternChar);

            if (wordMap == null) {
                map.put(patternChar, word);

                if (inverseMap.get(word) != null) {
                    return false;
                }

                inverseMap.put(word, patternChar);

                wordMap = word;
            }

            if (!wordMap.equals(word)) {
                return false;
            }
        }

        return true;
    }
}
