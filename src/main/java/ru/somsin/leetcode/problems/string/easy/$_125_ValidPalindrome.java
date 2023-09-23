package ru.somsin.leetcode.problems.string.easy;

public class $_125_ValidPalindrome {
    static public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (!isChar(s.charAt(left))) {
                for (int i = left + 1; i <= right; i++) {
                    if (isChar(s.charAt(i))) {
                        left = i;
                        break;
                    }
                }
            }

            if (!isChar(s.charAt(right))) {
                for (int i = right - 1; i >= left; i--) {
                    if (isChar(s.charAt(i))) {
                        right = i;
                        break;
                    }
                }
            }

            Character leftChar = toLowerCase(s.charAt(left));
            Character rightChar = toLowerCase(s.charAt(right));

            if (leftChar != rightChar && (isChar(leftChar) || isChar(rightChar))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static private boolean isChar(Character ch) {
        return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
    }

    static private Character toLowerCase(Character ch) {
        if (ch >= 65 && ch <= 90) {
            return (char) (ch + 32);
        }

        return ch;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
