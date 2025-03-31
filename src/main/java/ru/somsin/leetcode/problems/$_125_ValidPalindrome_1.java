package ru.somsin.leetcode.problems;

public class $_125_ValidPalindrome_1 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        char[] charArray = s.toCharArray();

        while (left <= right) {
            int leftChar = charArray[left];
            int rightChar = charArray[right];

            if (isNotAlphanumeric(leftChar)) {
                left++;
                continue;
            } else if (isNotAlphanumeric(rightChar)) {
                right--;
                continue;
            }

            if (toUpperCase(leftChar) != toUpperCase(rightChar)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private int toUpperCase(int ascii) {
        return ascii >= 97 ? ascii - 32 : ascii;
    }

    private boolean isNotAlphanumeric(int ascii) {
        return (ascii < 48 || ascii > 57) && (ascii < 65 || ascii > 90) && (ascii < 97 || ascii > 122);
    }
}
