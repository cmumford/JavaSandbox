import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DigitsTest {

    @Test
    public void defaultConstructor() {
        Digits digits = new Digits(0);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(0);
        Assert.assertArrayEquals(expected.toArray(), digits.digitList.toArray());
    }

    @Test
    public void testConstructor() {
        Digits digits = new Digits(127498654);
        ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 7, 4, 9, 8, 6, 5, 4));

        Assert.assertArrayEquals(expected.toArray(), digits.digitList.toArray());
    }

    @Test
    public void testIncreasing() {
        Assert.assertTrue(new Digits(7).isStrictlyIncreasing());
        Assert.assertTrue(new Digits(1356).isStrictlyIncreasing());

        Assert.assertFalse(new Digits(1336).isStrictlyIncreasing());
        Assert.assertFalse(new Digits(1536).isStrictlyIncreasing());
        Assert.assertFalse(new Digits(65310).isStrictlyIncreasing());
    }
}
