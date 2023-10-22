package ru.somsin.leetcode.problems.easy;

public class $_1071_GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.charAt(0) != str2.charAt(0)) {
            return "";
        }

        for (int i = 0; i < str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(i);
            }
        }

        return str1.substring(str2.length());
    }
}
