public class Phrase {
    private String currentPhrase;

    /**
     * Constructs a new Phrase object.
     */
    public Phrase(String p) {
        currentPhrase = p;
    }

    /**
     * Returns the index of the nth occurrence of str in the current phrase;
     * returns -1 if the nth occurrence does not exist.
     * Precondition: str.length() > 0 and n > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findNthOccurrence(String str, int n) {
        int startPos = 0;
        int pos = 0;
        for (int i = 0; i < n && pos != -1; i++) {
            pos = currentPhrase.indexOf(str, startPos);
            if (i == (n - 1))
                break;
            startPos = pos + 1;
        }
        return pos;
    }

    /**
     * Modifies the current phrase by replacing the nth occurrence of str with repl.
     * If the nth occurrence does not exist, the current phrase is unchanged.
     * Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl) {
        int pos = findNthOccurrence(str, n);
        if (pos == -1)
            return;
        currentPhrase = currentPhrase.substring(0, pos) + repl + currentPhrase.substring(pos + str.length());
    }

    /**
     * Returns the index of the last occurrence of str in the current phrase;
     * returns -1 if str is not found.
     * Precondition: str.length() > 0
     * Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str) {
        return currentPhrase.lastIndexOf(str);
    }

    /**
     * Returns a string containing the current phrase.
     */
    public String toString() {
        return currentPhrase;
    }
}
