package ru.somsin.leetcode.problems.string.easy;

public class $_125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        String text = s.toLowerCase().replace(' ', '');
        int left = 0, right = text.length - 1;

        for (left < right) {
            if (!isChar(s.charAt(left))) {
                for (int i = left + 1; i < right; i++) {
                    if (isChar(s.charAt(i))) {
                        left = i;
                        break;
                    }
                }
            }

            if (!isChar(s.charAt(right))) {
                for (int i = right - 1; i > left; i--) {
                    if (isChar(s.charAt(i))) {
                        right = i;
                        break;
                    }
                }
            }

            Character leftChar = toLowerCase(s.charAt(left));
            Character rightChar = toLowerCase(s.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isChar(Character ch) {
        return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
    }

    private Character toLowerCase(Character ch) {
        if (ch >= 65 && ch <= 90) {
            return ch + 32;
        }

        return ch;
    }
}
