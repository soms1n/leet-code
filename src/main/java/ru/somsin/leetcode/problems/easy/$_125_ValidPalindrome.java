package ru.somsin.leetcode.problems.easy;

import static java.lang.Character.isLetterOrDigit;
import static java.lang.Character.toLowerCase;

public class $_125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!isLetterOrDigit(leftChar)) {
                left++;
            } else if (!isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (toLowerCase(leftChar) != toLowerCase(rightChar)) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}
