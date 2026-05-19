package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class $_15_3Sum_1 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        Map<Integer, Set<Integer>> lastValue = new HashMap<>();

        int i = 0, j = 1, k = nums.length - 1;
        while (true) {
            if (nums[i] > 0) {
                break;
            }

            int target = nums[i];
            int sum = target + nums[j] + nums[k];
            if (sum == 0) {
                Set<Integer> lastK = lastValue.get(nums[j]);
                if (lastK == null || !lastK.contains(nums[k])) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    if (lastK == null) {
                        lastK = new HashSet<>();
                        lastValue.put(nums[j], lastK);
                    }
                    lastK.add(nums[k]);
                }
                j++;
                k--;
            } else if (sum < 0) {
                j++;
            } else {
                k--;
            }

            if (j >= k) {
                i++;
                j = i + 1;
                k = nums.length - 1;
            }

            if (i >= nums.length - 3) {
                break;
            }
        }

        return result;
    }
}
