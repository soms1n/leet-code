package ru.somsin.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class $_202_HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> calculated = new HashSet<>();

        while (n != 1 && !calculated.contains(n)) {
            calculated.add(n);

            int sum = 0;

            while (n != 0) {
                int number = n % 10;
                sum += number * number;
                n /= 10;
            }

            n = sum;
        }

        return n == 1;
    }
}
