import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     * close delimiter.
     * Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList<String> delimiters = new ArrayList<>();

        for (String token: tokens) {
            if (token == openDel || token == closeDel)
                delimiters.add(token);
        }
        return delimiters;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int depth = 0;
        for(String token : delimiters) {
            if (token == openDel)
                depth++;
            else
                depth--;
            if (depth < 0)
                return false;
        }
        return depth == 0;
    }
}
