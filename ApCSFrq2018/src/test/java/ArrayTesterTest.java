import org.junit.Assert;
import org.junit.Test;

public class ArrayTesterTest {
    @Test
    public void test() {
        int[][] arr2D = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {9, 5, 3}};

        int[] expected = {1, 4, 7, 5};
        Assert.assertArrayEquals(expected, ArrayTester.getColumn(arr2D, 1));
    }

    @Test
    public void valid1() {
        int[][] valid = {
                {1, 2, 3},
                {2, 3, 1},
                {3, 1, 2}};
        Assert.assertTrue(ArrayTester.isLatin(valid));
    }

    @Test
    public void valid2() {
        int[][] valid = {
                {10, 30, 20, 0},
                {0, 20, 30, 10},
                {30, 0, 10, 20},
                {20, 10, 0, 30}};
        Assert.assertTrue(ArrayTester.isLatin(valid));
    }

    @Test
    public void invalid1() {
        int[][] invalid = {
                {1, 2, 1},
                {2, 1, 1},
                {1, 1, 2}};
        Assert.assertFalse(ArrayTester.isLatin(invalid));
    }

    @Test
    public void invalid2() {
        int[][] invalid = {
                {1, 2, 3},
                {3, 1, 2},
                {7, 8, 9}};
        Assert.assertFalse(ArrayTester.isLatin(invalid));
    }

    @Test
    public void invalid3() {
        int[][] invalid = {
                {1, 2},
                {1, 2}};
        Assert.assertFalse(ArrayTester.isLatin(invalid));
    }
}
