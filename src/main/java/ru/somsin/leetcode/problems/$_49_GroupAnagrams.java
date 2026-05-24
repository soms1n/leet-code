package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class $_49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String string : strs) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            map.computeIfAbsent(new String(chars), (key) -> new ArrayList<>())
                    .add(string);
        }
        return new ArrayList<>(map.values());
    }
}
