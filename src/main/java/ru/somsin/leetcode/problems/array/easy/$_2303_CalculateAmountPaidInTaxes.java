package ru.somsin.leetcode.problems.array.easy;

public class $_2303_CalculateAmountPaidInTaxes {
    public double calculateTax(int[][] brackets, int income) {
        if (income == 0) {
            return 0;
        }

        int upper = 0, percent = 1;

        int value = Math.min(brackets[0][upper], income);
        double tax = calculateTax(value, brackets[0][percent]);

        income -= value;

        for (int row = 1; row < brackets.length; row++) {
            if (income == 0) {
                return tax;
            }

            int diff = brackets[row][upper] - brackets[row - 1][upper];
            value = Math.min(diff, income);

            tax += calculateTax(value, brackets[row][percent]);

            income -= value;
        }

        return tax;
    }

    public double calculateTax(int value, int percent) {
        return value * ((double) percent / 100);
    }
}
