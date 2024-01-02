package ru.somsin.leetcode.problems;

import java.util.HashMap;
import java.util.Map;

public class $_567_PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        int counter = 0;

        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            counter++;
        }

        int left = 0, right = 0;

        while (right < s2.length()) {
            char current = s2.charAt(right);

            if (map.containsKey(current) && map.get(current) > 0) {
                int val = map.get(current) - 1;
                map.put(current, val);

                if (val >= 0) {
                    counter--;
                }
            } else {
                counter += counter < s1.length() ? 1 : 0;

                char leftChar = s2.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                }

                left++;
            }

            if (counter == 0) {
                return true;
            }

            right++;
        }

        return false;
    }
}
