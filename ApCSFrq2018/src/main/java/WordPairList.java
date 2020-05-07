import java.util.ArrayList;

public class WordPairList {
    /**
     * The list of word pairs, initialized by the constructor.
     */
    private ArrayList<WordPair> allPairs;

    /**
     * Constructs a WordPairList object as described in part (a). * Precondition: words.length >= 2
     */
    public WordPairList(String[] words) {
        allPairs = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }

    /**
     * Returns the number of matches as described in part (b).
     */
    public int numMatches() {
        int count = 0;
        for (WordPair pair : allPairs) {
            if (pair.getFirst() == pair.getSecond())
                count++;
        }
        return count;
    }

    /**
     * This is for the unit test. It returns in a format suitable for Assert.asssertArrayEquals().
     *
     * @return Array of pairs.
     */
    public String[][] getPairForTest() {
        String[][] ret = new String[allPairs.size()][2];

        for (int i = 0; i < allPairs.size(); i++) {
            ret[i][0] = allPairs.get(i).getFirst();
            ret[i][1] = allPairs.get(i).getSecond();
        }

        return ret;
    }
}
