package ru.somsin.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class $_22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generate(result, "", n, 0, 0);

        return result;
    }

    private void generate(List<String> result, String value, int n, int left, int right) {
        if (value.length() == n * 2) {
            result.add(value);
            return;
        }

        if (left < n) {
            generate(result, value + "(", n, left + 1, right);
        }

        if (right < left) {
            generate(result, value + ")", n, left, right + 1);
        }
    }
}
