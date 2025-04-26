package ru.somsin.leetcode.problems;

public class $_151_ReverseWordsInAString_1 {
    public String reverseWords(String s) {
        char[] result = s.toCharArray();
        int length = s.length();
        int skips = 0;

        for (int left = 0, right = 0; right < length; right++) {
            if (isCorrectChar(result[right])) {
                result[left++] = result[right];
            } else if (result[right] == ' ' && left > 0 && isCorrectChar(result[left - 1])
                    && right < length - 1 && isCorrectChar(result[right + 1])) {
                result[left++] = result[right];
            } else {
                skips++;
            }
        }

        length = length - skips - 1;

        for (int left = 0, right = length; left < right; left++, right--) {
            char temp = result[left];
            result[left] = result[right];
            result[right] = temp;
        }

        for (int left = 0, right = 0; left <= length && right <= length; ) {
            if (!isCorrectChar(result[left]) && !isCorrectChar(result[right])) {
                left++;
                right++;
                continue;
            }

            if (!isCorrectChar(result[left])) {
                left++;
                continue;
            }

            if ((result[right] == ' ' || right == length) && isCorrectChar(result[left])) {
                for (int i = left, j = right == length ? length : right - 1; i < j; i++, j--) {
                    char temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }

                left = right + 1;
            }

            right++;
        }

        return new String(result).substring(0, length + 1);
    }

    private boolean isCorrectChar(char result) {
        return Character.isLetter(result) || Character.isDigit(result);
    }
}
