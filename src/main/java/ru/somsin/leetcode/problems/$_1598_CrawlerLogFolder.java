package ru.somsin.leetcode.problems;

public class $_1598_CrawlerLogFolder {
    private final String UP = "../";
    private final String CURRENT = "./";

    public int minOperations(String[] logs) {
        int counter = 0;

        for (String log : logs) {
            int step = log.startsWith(UP) ? -1 : log.startsWith(CURRENT) ? 0 : 1;
            counter += counter == 0 && step < 0 ? 0 : step;
        }

        return counter;
    }
}
