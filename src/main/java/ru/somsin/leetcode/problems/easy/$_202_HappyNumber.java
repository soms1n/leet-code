package ru.somsin.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class $_202_HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> calculated = new HashSet<>();

        int value = n, sum = 0;

        while (sum != 1) {
            sum = 0;

            int length = String.valueOf(value).length();

            for (int i = 0, divider = 1; i < length; i++, divider *= 10) {
                int remainder = value / divider % 10;
                sum += remainder * remainder;
            }

            if (calculated.contains(sum)) {
                return false;
            }

            calculated.add(sum);
            value = sum;
        }

        return true;
    }
}
