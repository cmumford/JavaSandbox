import org.junit.Assert;
import org.junit.Test;

public class CheckDigitTest {
    @Test
    public void test() {
        Assert.assertEquals(2, CheckDigit.getCheck(159));
        Assert.assertTrue(CheckDigit.isValid(1592));
        Assert.assertFalse(CheckDigit.isValid(1593));
    }
}
