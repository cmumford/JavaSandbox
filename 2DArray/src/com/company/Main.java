package com.company;

public class Main {

    private static void printGrid(int[][] grid) {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final int kNumRows = 7;
        final int kNumCols = 9;

        // Allocate an empty 2-dimensional array
        int[][] grid = new int[kNumRows][kNumCols];

        // Clear the grid to all 5's.
        for (int x = 0; x < kNumCols; x++) {
            for (int y = 0; y < kNumRows; y++) {
                grid[y][x] = 5;
            }
        }

        // Set the left col to all 1's and the right col to all 9's
        for (int y = 0; y < kNumRows; y++) {
            grid[y][0] = 1;
            grid[y][kNumCols-1] = 9;
        }

        // Set the top row to 1..9 and the bottom row to 9..1
        for (int x = 0; x < kNumCols; x++) {
            grid[0][x] = x+1;
            grid[kNumRows-1][x] = kNumCols - x;
        }

        printGrid(grid);
    }
}
