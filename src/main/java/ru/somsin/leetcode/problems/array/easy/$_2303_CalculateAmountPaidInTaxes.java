package ru.somsin.leetcode.problems.array.easy;

public class $_2303_CalculateAmountPaidInTaxes {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        int prev = 0;

        for (int[] bracket : brackets) {
            int upper = bracket[0], percent = bracket[1];
            if (income >= upper) {
                tax += calculateTax(upper, prev, percent);
                prev = upper;
            } else {
                tax += calculateTax(income, prev, percent);
                return tax;
            }
        }

        return tax;
    }

    public double calculateTax(int value, int prev, int percent) {
        return (value - prev) * percent / 100d;
    }
}
