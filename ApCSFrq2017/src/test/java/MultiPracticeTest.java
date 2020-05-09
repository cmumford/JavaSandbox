import org.junit.Assert;
import org.junit.Test;

public class MultiPracticeTest {

    @Test
    public void example1() {
        StudyPractice p1 = new MultPractice(7, 3);
        Assert.assertEquals("7 TIMES 3", p1.getProblem());
        p1.nextProblem();
        Assert.assertEquals("7 TIMES 4", p1.getProblem());
        p1.nextProblem();
        Assert.assertEquals("7 TIMES 5", p1.getProblem());
        p1.nextProblem();
        Assert.assertEquals("7 TIMES 6", p1.getProblem());
    }

    @Test
    public void example2() {
        StudyPractice p2 = new MultPractice(4, 12);
        p2.nextProblem();
        Assert.assertEquals("4 TIMES 13", p2.getProblem());
        Assert.assertEquals("4 TIMES 13", p2.getProblem());

        p2.nextProblem();
        p2.nextProblem();
        Assert.assertEquals("4 TIMES 15", p2.getProblem());

        p2.nextProblem();
        Assert.assertEquals("4 TIMES 16", p2.getProblem());
    }
}
