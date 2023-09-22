package ru.somsin.leetcode.problems.string.easy;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class $_20_ValidParentheses {
    private final Map<Character, Character> signs = new HashMap<>();

    {
        signs.put('(', ')');
        signs.put('[', ']');
        signs.put('{', '}');
    }

    private final Set<Character> end = new HashSet<>();

    {
        end.add(')');
        end.add(']');
        end.add('}');
    }

    public boolean isValid(String s) {
        if (end.contains(s.charAt(0)) || s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char sign = s.charAt(i);

            if (end.contains(sign)) {
                if (stack.peek() == null || sign != signs.get(stack.pop())) {
                    return false;
                }
            } else {
                stack.push(sign);
            }
        }

        return stack.isEmpty();
    }
}
