package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            list.add(num);
        }

        permute(0, result, list);

        return result;
    }

    private void permute(int position, List<List<Integer>> result, List<Integer> list) {
        if (position == list.size()) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int index = position; index < list.size(); index++) {
            swap(list, index, position);
            permute(position + 1, result, list);
            swap(list, index, position);
        }
    }

    private void swap(List<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
