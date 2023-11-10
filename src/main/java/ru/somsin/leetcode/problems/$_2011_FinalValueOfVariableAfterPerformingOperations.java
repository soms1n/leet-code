package ru.somsin.leetcode.problems;

public class $_2011_FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String operation : operations) {
            x = operation.contains("-") ? x - 1 : x + 1;
        }

        return x;
    }
}
