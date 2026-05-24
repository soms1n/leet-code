package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $_49_GroupAnagrams_1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strs) {
            int[] mask = new int[26];
            for (int index = 0; index < string.length(); index++) {
                mask[string.charAt(index) - 'a']++;
            }

            StringBuilder builder = new StringBuilder();
            for (int index = 0; index < mask.length; index++) {
                builder.append(mask[index]).append("#");
            }

            map.computeIfAbsent(builder.toString(), (key) -> new ArrayList<>())
                    .add(string);
        }
        return new ArrayList<>(map.values());
    }
}
