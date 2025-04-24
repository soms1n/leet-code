package ru.somsin.leetcode.problems;

public class $_2511_MaximumEnemyFortsThatCanBeCaptured_1 {
    public int captureForts(int[] forts) {
        int result = 0;

        for (int left = 0, right = 0; right < forts.length; right++) {
            if (forts[right] != 0) {
                if (forts[left] == -forts[right]) {
                    result = Math.max(result, right - left - 1);
                }
                left = right;
            }
        }

        return result;
    }
}
