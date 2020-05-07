import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DelimitersTest {
    @Test
    public void example1() throws Exception {

        Delimiters delimiters = new Delimiters("(", ")");
        String[] tokens = {"(", "x + y", ")", " * 5"};
        ArrayList<String> delims = delimiters.getDelimitersList(tokens);
        String[] expected = {"(", ")"};
        Assert.assertArrayEquals(expected, delims.toArray());
    }

    @Test
    public void example2() throws Exception {

        Delimiters delimiters = new Delimiters("<q>", "</q>");
        String[] tokens = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> delims = delimiters.getDelimitersList(tokens);
        String[] expected = {"<q>", "</q>", "</q>"};
        Assert.assertArrayEquals(expected, delims.toArray());
    }

    @Test
    public void isBalanced() throws Exception {

        Delimiters delimiters = new Delimiters("<sup>", "</sup>");

        // ex. 1
        ArrayList<String> delims = new ArrayList<>(Arrays.asList("<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"));
        Assert.assertTrue(delimiters.isBalanced(delims));

        // ex. 2
        delims = new ArrayList<>(Arrays.asList("<sup>", "</sup>", "</sup>", "<sup>"));
        Assert.assertFalse(delimiters.isBalanced(delims));

        // ex. 3
        delims = new ArrayList<>(Arrays.asList("</sup>"));
        Assert.assertFalse(delimiters.isBalanced(delims));

        // ex. 4
        delims = new ArrayList<>(Arrays.asList("<sup>", "<sup>", "</sup>" ));
        Assert.assertFalse(delimiters.isBalanced(delims));
    }
}
