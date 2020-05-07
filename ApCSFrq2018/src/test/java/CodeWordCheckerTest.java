import org.junit.Assert;
import org.junit.Test;

public class CodeWordCheckerTest {
    @Test
    public void example1() {
        StringChecker sc1 = new CodeWordChecker(5, 8, "$");
        Assert.assertTrue(sc1.isValid("happy"));
        Assert.assertFalse(sc1.isValid("happy$"));
        Assert.assertFalse(sc1.isValid("Code"));
        Assert.assertFalse(sc1.isValid("happyCode"));
    }

    @Test
    public void example2() {
        StringChecker sc2 = new CodeWordChecker("pass");

        Assert.assertTrue(sc2.isValid("MyPass"));
        Assert.assertFalse(sc2.isValid("Mypassport"));
        Assert.assertFalse(sc2.isValid("happy"));
        Assert.assertFalse(sc2.isValid("1,000,000,000,000,000"));
    }
}
