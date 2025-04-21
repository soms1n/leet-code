package ru.somsin.leetcode.problems;

public class $_1455_CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int result = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (i == 0 || sentence.charAt(i - 1) == ' ') {
                result++;
                boolean found = true;

                for (int j = 0; j < searchWord.length(); j++, i++) {
                    if (i == sentence.length() || sentence.charAt(i) != searchWord.charAt(j)) {
                        found = false;
                        break;
                    }
                }

                if (found) {
                    return result;
                }
            }
        }

        return -1;
    }
}
