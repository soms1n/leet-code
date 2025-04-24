package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_2511_MaximumEnemyFortsThatCanBeCaptured {
    public int captureForts(int[] forts) {
        List<Integer> fortPositions = new ArrayList<>();

        for (int i = 0; i < forts.length; i++) {
            if (forts[i] == 1) {
                fortPositions.add(i);
            }
        }

        if (fortPositions.isEmpty()) {
            return 0;
        }

        int result = 0;

        for (int freePosition : fortPositions) {
            int left = freePosition - 1, right = freePosition + 1;
            boolean canLeft = true, canRight = true;

            while (canLeft || canRight) {
                if (left >= 0 && forts[left] == 0) {
                    left--;
                } else {
                    canLeft = false;
                }

                if (right < forts.length && forts[right] == 0) {
                    right++;
                } else {
                    canRight = false;
                }
            }

            if ((left >= 0 && forts[left] != -1) || (left < 0 && forts[left + 1] != -1)) {
                left = freePosition - 1;
            }

            if ((right < forts.length && forts[right] != -1) || (right == forts.length && forts[right - 1] != -1)) {
                right = freePosition + 1;
            }

            result = Math.max(result, Math.max(freePosition - (left + 1), right - freePosition - 1));
        }

        return result;
    }
}
