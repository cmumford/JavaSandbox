import org.junit.Assert;
import org.junit.Test;

public class LightBoardTest {
    @Test
    public void constructor() throws Exception {
        LightBoard lightBoard = new LightBoard(50, 50);
        Assert.assertNotNull(lightBoard);
    }

    @Test
    public void evaluateLight() throws Exception {
        LightBoard sim = new LightBoard(1, 1);
        boolean[][] testLights = {
                {true, true, false, true, true},
                {true, false, false, true, false},
                {true, false, false, true, true },
                {true, false, false, false, true },
                {true, false, false, false, true },
                {true, true, false, true, true },
                {false, false, false, false, false }
        };
        sim.setLightsForTesting(testLights);
        Assert.assertFalse(sim.evaluateLight(0, 3));
        Assert.assertTrue(sim.evaluateLight(6, 0));
        Assert.assertFalse(sim.evaluateLight(4, 1));
        Assert.assertTrue(sim.evaluateLight(5, 4));
    }
}
