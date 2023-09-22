package ru.somsin.leetcode.problems.string.easy;

import java.util.Deque;
import java.util.LinkedList;

public class $_20_ValidParentheses {
    public boolean isValid(String s) {
        char firstSign = s.charAt(0);

        if ((firstSign != '(' && firstSign != '{' && firstSign != '[') || s.length() % 2 != 0) {
            return false;
        }

        Deque<Character> stack = new LinkedList<>();

        for (char sign : s.toCharArray()) {
            switch (sign) {
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                default -> {
                    if (stack.isEmpty() || stack.pop() != sign) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
