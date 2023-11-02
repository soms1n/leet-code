package ru.somsin.leetcode.problems.easy;

public class $_434_NumberOfSegmentsInAString {
    public int countSegments(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int counter = 0;
        boolean waitSpace = false;

        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                if (!waitSpace) {
                    counter++;
                }

                waitSpace = true;
            } else {
                waitSpace = false;
            }
        }

        return counter;
    }
}
