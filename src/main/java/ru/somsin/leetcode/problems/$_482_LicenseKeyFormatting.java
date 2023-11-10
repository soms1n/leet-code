package ru.somsin.leetcode.problems;

public class $_482_LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();

        for (int counter = 0, index = s.length() - 1; index >= 0; index--) {
            if (s.charAt(index) == '-') {
                continue;
            }

            if (counter > 0 && counter % k == 0) {
                result.append("-");
            }

            result.append(s.charAt(index));

            counter++;
        }

        return result.reverse().toString().toUpperCase();
    }
}
