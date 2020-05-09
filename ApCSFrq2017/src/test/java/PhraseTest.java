import org.junit.Assert;
import org.junit.Test;

public class PhraseTest {
    @Test
    public void test1() {
        Phrase phrase = new Phrase("A cat ate late.");
        phrase.replaceNthOccurrence("at", 1, "rane");
        Assert.assertEquals("A crane ate late.", phrase.toString());
    }

    @Test
    public void test2() {
        Phrase phrase = new Phrase("A cat ate late.");
        phrase.replaceNthOccurrence("at", 6, "xx");
        Assert.assertEquals("A cat ate late.", phrase.toString());
    }

    @Test
    public void test3() {
        Phrase phrase = new Phrase("A cat ate late.");
        phrase.replaceNthOccurrence("bat", 2, "xx");
        Assert.assertEquals("A cat ate late.", phrase.toString());
    }

    @Test
    public void test4() {
        Phrase phrase = new Phrase("aaaa");
        phrase.replaceNthOccurrence("aa", 1, "xx");
        Assert.assertEquals("xxaa", phrase.toString());
    }

    @Test
    public void test5() {
        Phrase phrase = new Phrase("aaaa");
        phrase.replaceNthOccurrence("aa", 2, "bbb");
        Assert.assertEquals("abbba", phrase.toString());
    }

    @Test
    public void testLast() {
        Phrase phrase = new Phrase("A cat ate late.");
        Assert.assertEquals(11, phrase.findLastOccurrence("at"));
        Assert.assertEquals(2, phrase.findLastOccurrence("cat"));
        Assert.assertEquals(-1, phrase.findLastOccurrence("bat"));
    }
}
