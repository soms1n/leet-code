package ru.somsin.leetcode.problems.easy;

public class $_28_FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int result = -1, needleIndex = 0;

        for (int haystackIndex = 0; haystackIndex < haystack.length(); haystackIndex++) {
            if (haystack.charAt(haystackIndex) != needle.charAt(needleIndex)) {
                needleIndex = 0;

                if (result != -1) {
                    haystackIndex = result;
                }

                result = -1;
            } else {
                if (result == -1) {
                    result = haystackIndex;
                }

                needleIndex++;
            }

            if (needleIndex == needle.length()) {
                return result;
            }
        }

        return needleIndex == needle.length() ? result : -1;
    }
}
