package ru.somsin.leetcode.problems;

public class $_392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        for (int left = 0, right = 0; right < t.length(); right++) {
            if (s.charAt(left) == t.charAt(right)) {
                if (++left == s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}
