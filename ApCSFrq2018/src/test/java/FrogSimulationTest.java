import org.junit.Assert;
import org.junit.Test;

public class FrogSimulationTest {
    @Test
    public void constructor() {
        FrogSimulation sim = new FrogSimulation(24, 5);

        Assert.assertNotNull(sim);
    }

    @Test
    public void runSimulations() {
        FrogSimulation sim = new FrogSimulation(24, 5);

        Assert.assertEquals(0, sim.runSimulations(0), 0.0);

        double ratio = sim.runSimulations(100);
        Assert.assertTrue(ratio >= 0.0 && ratio <= 1.0);
    }
}
