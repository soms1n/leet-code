package ru.somsin.leetcode.problems.easy;

public class $_434_NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int counter = 0;

        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) != ' ' && (index == 0 || s.charAt(index - 1) == ' ')) {
                counter++;
            }
        }

        return counter;
    }
}
