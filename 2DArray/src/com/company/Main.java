package com.company;

public class Main {

    /**
     * Print a 2-dimensional array of integers to stdout.
     *
     * @param grid The 2D arra of int's in col/row order.
     */
    private static void printGrid(int[][] grid) {
        int numCols = grid.length;
        int numRows = grid[0].length;
        for (int y = 0; y < numRows; y++) {
            for (int x = 0; x < numCols; x++) {
                System.out.print(grid[x][y]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        final int kNumRows = 7;
        final int kNumCols = 9;

        // Allocate an empty 2-dimensional array
        int[][] grid = new int[kNumCols][kNumRows];

        // Clear the grid to all 5's.
        for (int x = 0; x < kNumCols; x++) {
            for (int y = 0; y < kNumRows; y++) {
                grid[x][y] = 5;
            }
        }

        // Set the left col to all 1's and the right col to all 9's
        for (int y = 0; y < kNumRows; y++) {
            grid[0][y] = 1;
            grid[kNumCols-1][y] = 9;
        }

        // Set the top row to 1..9 and the bottom row to 9..1
        for (int x = 0; x < kNumCols; x++) {
            grid[x][0] = x+1;
            grid[x][kNumRows-1] = kNumCols - x;
        }

        printGrid(grid);
    }
}
