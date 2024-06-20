package org.example;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if ((!set.add(i + " row " + c) || (!set.add(j + " col " + c) ||
                            (!set.add(i/3 + " " + j/3 + " " + c))))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}