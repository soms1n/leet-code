package ru.somsin.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class $_202_HappyNumber_1 {
    public boolean isHappy(int n) {
        Set<Integer> calculated = new HashSet<>();

        while (true) {
            int value = 0;

            do {
                value += (int) Math.pow(n < 10 ? n : n % 10, 2);
            } while ((n /= 10) != 0);

            if (value == 1) {
                return true;
            }

            if (calculated.contains(value)) {
                return false;
            }

            calculated.add(value);
            n = value;
        }
    }
}
