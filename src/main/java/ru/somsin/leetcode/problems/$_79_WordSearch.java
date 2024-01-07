package ru.somsin.leetcode.problems;

public class $_79_WordSearch {
    public boolean exist(char[][] board, String word) {
        int[] visited = new int[board.length * board[0].length];

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                if (board[row][column] == word.charAt(0) && hasWord(board, word, 0, visited, row, column)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean hasWord(char[][] board, String word, int position, int[] visited, int row, int column) {
        int rows = board.length, columns = board[0].length;

        if (word.length() == position) {
            return true;
        }

        if (row < 0 || row >= rows
                || column < 0 || column >= columns
                || word.charAt(position) != board[row][column]
                || visited[row * columns + column] != 0) {
            return false;
        }

        visited[row * columns + column]++;

        position++;

        if (hasWord(board, word, position, visited, row - 1, column)
                || hasWord(board, word, position, visited, row, column + 1)
                || hasWord(board, word, position, visited, row + 1, column)
                || hasWord(board, word, position, visited, row, column - 1)) {
            return true;
        }

        visited[row * columns + column]--;

        return false;
    }
}
