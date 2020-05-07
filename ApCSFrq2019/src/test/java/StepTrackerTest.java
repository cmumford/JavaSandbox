import org.junit.Assert;
import org.junit.Test;

public class StepTrackerTest {
    @Test
    public void defaultTracker() throws Exception {

        StepTracker tracker = new StepTracker(1000);
        Assert.assertEquals(0, tracker.activeDays());
        Assert.assertEquals(0, tracker.averageSteps(), 0.0);
    }

    @Test
    public void activeDays() throws Exception {

        StepTracker tracker = new StepTracker(1000);
        tracker.addDailySteps(999);
        tracker.addDailySteps(1000);
        tracker.addDailySteps(1001);
        Assert.assertEquals(2, tracker.activeDays());
    }

    @Test
    public void averageSteps() throws Exception {

        StepTracker tracker = new StepTracker(100);
        tracker.addDailySteps(5);
        Assert.assertEquals(5, tracker.averageSteps(), 0.0);

        tracker.addDailySteps(15);
        Assert.assertEquals(10, tracker.averageSteps(), 0.0);
    }

    @Test
    public void example() throws Exception {
        StepTracker tr = new StepTracker(10000);
        Assert.assertEquals(0, tr.activeDays());
        Assert.assertEquals(0.0, tr.averageSteps(), 0.0);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        Assert.assertEquals(0, tr.activeDays());
        Assert.assertEquals(7000.0, tr.averageSteps(), 0.0);
        tr.addDailySteps(13000);
        Assert.assertEquals(1, tr.activeDays());
        Assert.assertEquals(9000.0, tr.averageSteps(), 0.0);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        Assert.assertEquals(2, tr.activeDays());
        Assert.assertEquals(10222.2, tr.averageSteps(), 0.0);
    }
}
