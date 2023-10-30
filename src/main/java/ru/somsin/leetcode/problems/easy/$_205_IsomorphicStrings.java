package ru.somsin.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class $_205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();

        for (int index = 0; index < s.length(); index++) {
            char sChar = s.charAt(index);
            char tChar = t.charAt(index);

            if (!sMap.containsKey(sChar)) {
                if (tMap.containsKey(tChar)) {
                    return false;
                }

                sMap.put(sChar, tChar);
                tMap.put(tChar, sChar);
            }

            if (sMap.get(sChar) != tChar) {
                return false;
            }
        }

        return true;
    }
}
