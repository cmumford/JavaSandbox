public class ArrayTester {
    /**
     * Returns an array containing the elements of column c of arr2D in the same order as
     * they appear in arr2D.
     * Precondition: c is a valid column index in arr2D.
     * Postcondition: arr2D is unchanged.
     */
    public static int[] getColumn(int[][] arr2D, int c) {
        int numRows = arr2D.length;
        int[] column = new int[numRows];
        for (int r = 0; r < numRows; r++) {
            column[r] = arr2D[r][c];
        }
        return column;
    }

    /**
     * Returns true if and only if every value in arr1 appears in arr2.
     * Precondition: arr1 and arr2 have the same length.
     * Postcondition: arr1 and arr2 are unchanged.
     */
    public static boolean hasAllValues(int[] arr1, int[] arr2) {
        for (int val1 : arr1) {
            boolean in2 = false;
            for (int val2 : arr2) {
                if (val1 == val2) {
                    in2 = true;
                    break;
                }
            }
            if (!in2)
                return false;
        }
        return true;
    }

    /**
     * Returns true if arr contains any duplicate values;
     * false otherwise.
     */
    public static boolean containsDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns true if square is a Latin square as described in part (b); false otherwise.
     * Precondition: square has an equal number of rows and columns.
     * square has at least one row.
     */
    public static boolean isLatin(int[][] square) {
        int[] firstRow = square[0];
        if (containsDuplicates(firstRow))
            return false;
        for (int r = 1; r < square.length; r++) {
            if (!hasAllValues(firstRow, square[r]))
                return false;
        }
        int numCols = firstRow.length;
        for (int c = 0; c < numCols; c++) {
            if (!hasAllValues(firstRow, getColumn(square, c)))
                return false;
        }
        return true;
    }
}
