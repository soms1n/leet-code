package ru.somsin.leetcode.problems;

public class $_67_AddBinary {
    public String addBinary(String a, String b) {
        int rightA = a.length() - 1, rightB = b.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;

        while (rightA >= 0 || rightB >= 0) {
            int sum = carry;

            sum += rightA >= 0 ? a.charAt(rightA--) - '0' : 0;
            sum += rightB >= 0 ? b.charAt(rightB--) - '0' : 0;

            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
