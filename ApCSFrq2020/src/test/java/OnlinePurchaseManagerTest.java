import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class OnlinePurchaseManagerTest {
    @Test
    public void test_default() {
        OnlinePurchaseManager opm = new OnlinePurchaseManager();
        Assert.assertEquals(0, opm.countElectronicsByMaker(""));
        Assert.assertEquals(0, opm.countElectronicsByMaker("XYZ"));
    }

    @Test
    public void test_countElectronicsByMaker() {
        OnlinePurchaseManager opm = new OnlinePurchaseManager();
        opm.purchases = new ArrayList<>(Arrays.asList(
                new Gizmo("ABC", true),
                new Gizmo("ABC", false),
                new Gizmo("XYZ", true),
                new Gizmo("lmnop", false),
                new Gizmo("ABC", true),
                new Gizmo("ABC", false)
        ));

        Assert.assertEquals(2, opm.countElectronicsByMaker("ABC"));
        Assert.assertEquals(0, opm.countElectronicsByMaker("lmnop"));
        Assert.assertEquals(1, opm.countElectronicsByMaker("XYZ"));
        Assert.assertEquals(0, opm.countElectronicsByMaker("QRP"));
    }

    @Test
    public void test_hasAdjacentEqualPair() {
        OnlinePurchaseManager opm = new OnlinePurchaseManager();
        Assert.assertFalse(opm.hasAdjacentEqualPair());

        opm.purchases = new ArrayList<>(Arrays.asList(
                new Gizmo("ABC", true)
        ));
        Assert.assertFalse(opm.hasAdjacentEqualPair());

        opm.purchases = new ArrayList<>(Arrays.asList(
                new Gizmo("ABC", true),
                new Gizmo("ABC", false),
                new Gizmo("XYZ", true),
                new Gizmo("lmnop", false),
                new Gizmo("ABC", true),
                new Gizmo("ABC", false)
        ));
        Assert.assertFalse(opm.hasAdjacentEqualPair());

        opm.purchases = new ArrayList<>(Arrays.asList(
                new Gizmo("ABC", true),
                new Gizmo("ABC", true)
        ));
        Assert.assertTrue(opm.hasAdjacentEqualPair());
    }
}
