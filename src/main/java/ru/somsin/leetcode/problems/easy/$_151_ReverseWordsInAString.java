package ru.somsin.leetcode.problems.easy;

public class $_151_ReverseWordsInAString {
    public String reverseWords(String s) {
        int length = s.length();
        char[] result = new char[length];

        boolean needSpace = false;

        for (int left = 0, right = length - 1; right >= 0; right--) {
            if (s.charAt(right) != ' ') {
                needSpace = true;
                result[left++] = s.charAt(right);
            } else if (needSpace) {
                needSpace = false;
                result[left++] = ' ';
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (result[i] != ' ' && result[i] != '\u0000') {
                length = i + 1;
                break;
            }
        }

        for (int i = 0, left = -1, right = -1; i < length; i++) {
            char ch = result[i];

            if (left == -1 && ch != ' ') {
                left = i;
            }

            if (left != -1) {
                if (ch == ' ') {
                    right = i - 1;
                } else if (i == length - 1) {
                    right = i;
                }
            }

            if (left != -1 && right != -1) {
                while (left <= right) {
                    char temp = result[left];
                    result[left++] = result[right];
                    result[right--] = temp;
                }

                left = -1;
                right = -1;
            }
        }

        return new String(result).substring(0, length);
    }
}
