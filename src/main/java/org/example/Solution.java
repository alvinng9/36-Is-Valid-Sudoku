package org.example;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // create a hash set to add value a different positions with their
        // coordinates
        HashSet<String> set = new HashSet<>();
        // iterate through the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char b = board[i][j];
                // check if the position is empty or not
                if (b != '.') {
                    // check if the set already has that value in that row
                    // check if the set already has that value if that column
                    // check if the set already has that value in the 3x3 square
                    if(!(set.add(b + " " + i + " row")) || !(set.add(b + " " + j + "col")) || !(set.add(b + " " + i/3 + " " + j/3))) {
                        return false;
                    }
                }
            }
        }
        // returns true at the end if there is no duplicates trying to be added to the String set
        return true;
    }
}
