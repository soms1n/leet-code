package ru.somsin.leetcode.problems;

public class $_258_AddDigits {
    public int addDigits(int num) {
        while (num > 9) {
            int sum = 0;

            do {
                sum += num % 10;
                num /= 10;
            } while (num > 0);

            num = sum;
        }

        return num;
    }
}
