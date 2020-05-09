public class Position {
    int row;
    int col;

    /**
     * Constructs a Position object with row r and column c.
     */
    public Position(int r, int c) {
        row = r;
        col = c;
    }

    /**
     * Returns the position of num in intArr;
     * returns null if no such element exists in intArr.
     * Precondition: intArr contains at least one row.
     */
    public static Position findPosition(int num, int[][] intArr) {
        int numCols = intArr[0].length;
        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < numCols; c++) {
                if (intArr[r][c] == num)
                    return new Position(r, c);
            }
        }
        return null;
    }

    /**
     * Returns a 2D successor array as described in part (b) constructed from intArr.
     * Precondition: intArr contains at least one row and contains consecutive values.
     * Each of these integers may be in any position in the 2D array.
     */
    public static Position[][] getSuccessorArray(int[][] intArr) {
        int numCols = intArr[0].length;
        Position[][] successors = new Position[intArr.length][numCols];

        for (int r = 0; r < intArr.length; r++) {
            for (int c = 0; c < numCols; c++) {
                successors[r][c] = findPosition(intArr[r][c] + 1, intArr);
            }
        }
        return successors;
    }

    // Added for testing.
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Position)) {
            return false;
        }

        Position pos = (Position) o;
        return pos.col == col && pos.row == row;
    }
}
