public class LightBoard {
    /** The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;

    /** Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols)
    {
        lights = new boolean[numRows][numCols];
        int totalNumLights = numCols * numRows;
        int numOnLights = 40 * totalNumLights / 100;
        int lightNum = 0;
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row < numRows; row++) {
                lights[row][col] = lightNum < numOnLights;
                lightNum++;
            }
        }
    }

    private static boolean isEvenlyDivisible(int number, int divisor) {
        return number % divisor == 0;
    }

    /** Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col)
    {
        int numRows = lights.length;
        int numOnLightsInCol = 0;
        for (int r = 0; r < numRows; r++) {
            if (lights[r][col])
                numOnLightsInCol++;
        }
        if (lights[row][col]) {
            // light is on.
            return !isEvenlyDivisible(numOnLightsInCol, 2);
        } else {
            // light is off.
            return isEvenlyDivisible(numOnLightsInCol, 3);
        }
    }

    public void setLightsForTesting(boolean[][] testLights) {
        lights = testLights;
    }
}
