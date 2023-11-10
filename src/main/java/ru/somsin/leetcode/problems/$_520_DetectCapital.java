package ru.somsin.leetcode.problems;

public class $_520_DetectCapital {
    enum State {
        FIRST_UPPER(2), LOWER(1), UPPER(1);

        private final int startPosition;

        State(int startPosition) {
            this.startPosition = startPosition;
        }

        public int getStartPosition() {
            return startPosition;
        }
    }

    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }

        State state = State.LOWER;

        if (isUpper(word.charAt(0))) {
            state = isUpper(word.charAt(1)) ? State.UPPER : State.FIRST_UPPER;
        }

        for (int index = state.getStartPosition(); index < word.length(); index++) {
            if (state == State.FIRST_UPPER || state == State.LOWER) {
                if (isUpper(word.charAt(index))) {
                    return false;
                }
            } else {
                if (!isUpper(word.charAt(index))) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isUpper(char ch) {
        return ch < 91;
    }
}
