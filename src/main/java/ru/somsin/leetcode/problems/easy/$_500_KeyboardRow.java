package ru.somsin.leetcode.problems.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class $_500_KeyboardRow {
    private final Set<Character> first = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P');
    private final Set<Character> second = Set.of('Q', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'q', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
    private final Set<Character> third = Set.of('Z', 'X', 'C', 'V', 'B', 'N', 'M', 'z', 'x', 'c', 'v', 'b', 'n', 'm');

    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();

        for (String word : words) {
            boolean isFirst = defineSet(first, word);
            boolean isSecond = !isFirst && defineSet(second, word);
            boolean isThird = !isFirst && !isSecond && defineSet(third, word);

            if (!isFirst && !isSecond && !isThird) {
                continue;
            }

            boolean isSuccess = true;

            for (char ch : word.toCharArray()) {
                if (isFirst) {
                    if (!first.contains(ch)) {
                        isSuccess = false;
                        break;
                    }
                } else if (isSecond) {
                    if (!second.contains(ch)) {
                        isSuccess = false;
                        break;
                    }
                } else if (isThird) {
                    if (!third.contains(ch)) {
                        isSuccess = false;
                        break;
                    }
                }
            }

            if (isSuccess) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean defineSet(Set<Character> set, String word) {
        return set.contains(word.charAt(0));
    }
}
