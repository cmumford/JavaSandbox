package com.company;

import java.util.Random;

public class Main {

    private static boolean isOnChessboard(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }

    public static void main(String[] args) {

        boolean[][] visited = new boolean[8][8];
        Random rnd = new Random();
        int currentX = rnd.nextInt(8);
        int currentY = rnd.nextInt(8);

        // Mark the starting position as visited.
        visited[currentX][currentY] = true;

        // Valid moves of the horse chess piece relative to the current position.
        final int[][] validMoves = {
                { 1,  2},
                { 2,  1},
                {-1,  2},
                {-2,  1},

                { 1, -2},
                { 2, -1},
                {-1, -2},
                {-2, -1},
        };
        int numMoves = 0;
        while (true) {
            System.out.println(String.format("Currently at (%d, %d)", currentX, currentY));
            boolean foundNewPos = false;
            for (int n = 0; !foundNewPos && n < validMoves.length; n++) {
                int newX = currentX + validMoves[n][0];
                int newY = currentY + validMoves[n][1];
                if (isOnChessboard(newX, newY) && !visited[newX][newY]) {
                    currentX = newX;
                    currentY = newY;
                    visited[currentX][currentY] = true;
                    numMoves++;
                    foundNewPos = true;
                }
            }

            // Can't move anywhere.
            if (!foundNewPos)
                break;
        }

        System.out.println(String.format("You made %d moves", numMoves));
    }
}
