package ru.somsin.leetcode.problems;

public class $_917_ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] result = s.toCharArray();

        for (int left = 0, right = s.length() - 1; left < right; ) {
            if (!Character.isLetter(result[left])) {
                left++;
            } else if (!Character.isLetter(result[right])) {
                right--;
            } else {
                char temp = result[left];
                result[left++] = result[right];
                result[right--] = temp;
            }
        }

        return new String(result);
    }
}
