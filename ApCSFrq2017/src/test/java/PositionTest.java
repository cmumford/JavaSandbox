import org.junit.Assert;
import org.junit.Test;

public class PositionTest {
    @Test
    public void test() {
        int[][] intArr = {
                {15, 5, 9, 10},
                {12, 16, 11, 6},
                {14, 8, 13, 7},
        };
        Position[][] successors = Position.getSuccessorArray(intArr);

        Position[][] expected = {
                {new Position(1, 1),new Position(1, 3), new Position(0, 3), new Position(1, 2)},
                {new Position(2, 2),null, new Position(1, 0), new Position(2, 3)},
                {new Position(0, 0),new Position(0, 2), new Position(2, 0), new Position(2, 1)},
        };

        Assert.assertArrayEquals(expected, successors);
    }
}
