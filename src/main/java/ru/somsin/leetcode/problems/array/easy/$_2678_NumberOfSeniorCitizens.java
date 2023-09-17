package ru.somsin.leetcode.problems.array.easy;

public class $_2678_NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int counter = 0;

        for (String ticket : details) {
            if (Integer.parseInt("" + ticket.charAt(11) + ticket.charAt(12)) > 60) {
                counter++;
            }
        }

        return counter;
    }
}
