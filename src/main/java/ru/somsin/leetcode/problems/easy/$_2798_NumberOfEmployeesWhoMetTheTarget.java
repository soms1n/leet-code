package ru.somsin.leetcode.problems.easy;

public class $_2798_NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;

        for (int hour : hours) {
            if (hour >= target) {
                counter++;
            }
        }

        return counter;
    }
}
