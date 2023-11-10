package ru.somsin.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class $_68_TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        int usedWordsCounter = 0, currentIndex = 0, wordsLength = words.length;

        while (usedWordsCounter < wordsLength) {
            int startIndex = currentIndex;
            int totalLength = words[currentIndex].length();
            int counter = 1;

            while (totalLength < maxWidth && currentIndex < wordsLength - 1) {
                int length = words[currentIndex + 1].length() + 1;

                if (totalLength + length <= maxWidth) {
                    totalLength += length;
                    counter++;
                    currentIndex++;
                } else {
                    break;
                }
            }

            StringBuilder builder = new StringBuilder();

            if (currentIndex == wordsLength - 1) {
                for (int i = 0; i < counter; i++) {
                    builder.append(words[startIndex++]);

                    if (builder.length() == maxWidth || i == counter - 1) {
                        break;
                    }

                    builder.append(" ");
                }

                if (builder.length() != maxWidth) {
                    builder.append(" ".repeat(maxWidth - builder.length()));
                }
            } else {
                int spaceNumbers = maxWidth - (totalLength - (counter - 1));

                int[] spaces = new int[counter];

                for (int i = 0, position = 0; i < spaceNumbers; i++) {
                    spaces[position]++;

                    if (++position >= counter - 1) {
                        position = 0;
                    }
                }

                for (int i = 0; i < counter; i++) {
                    builder.append(words[startIndex++]);

                    if (builder.length() == maxWidth) {
                        break;
                    }

                    builder.append(" ".repeat(spaces[i]));
                }
            }

            result.add(builder.toString());

            usedWordsCounter += counter;
            currentIndex++;
        }

        return result;
    }
}
