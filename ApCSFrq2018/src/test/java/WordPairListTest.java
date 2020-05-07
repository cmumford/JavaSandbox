import org.junit.Assert;
import org.junit.Test;

public class WordPairListTest {
    @Test
    public void exampleOne() {
        String[] wordNums = {"one", "two", "three"};
        WordPairList exampleOne = new WordPairList(wordNums);
        String[][] expectedOne = {
                {"one", "two"},
                {"one", "three"},
                {"two", "three"},
        };
        Assert.assertEquals(0, exampleOne.numMatches());
        Assert.assertArrayEquals(expectedOne, exampleOne.getPairForTest());
    }

    @Test
    public void exampleTwo() {
        String[] phrase = {"the", "more", "the", "merrier"};
        WordPairList exampleTwo = new WordPairList(phrase);
        String[][] expected = {
                {"the", "more"},
                {"the", "the"},
                {"the", "merrier"},
                {"more", "the"},
                {"more", "merrier"},
                {"the", "merrier"},
        };

        Assert.assertEquals(1, exampleTwo.numMatches());
        Assert.assertArrayEquals(expected, exampleTwo.getPairForTest());
    }
}
