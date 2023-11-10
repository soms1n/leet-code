package ru.somsin.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class $_228_SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums.length == 0) {
            return result;
        }

        int left = nums[0], right = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == right || nums[i] == right + 1) {
                right = nums[i];
            } else {
                addResult(result, left, right);

                left = nums[i];
                right = nums[i];
            }

            if (i == nums.length - 1) {
                addResult(result, left, right);
            }
        }

        return result;
    }

    private void addResult(List<String> result, int left, int right) {
        if (left == right) {
            result.add(String.valueOf(left));
        } else {
            result.add(left + "->" + right);
        }
    }
}
