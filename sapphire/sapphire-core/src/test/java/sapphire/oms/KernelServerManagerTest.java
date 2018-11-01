package sapphire.oms;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sapphire.app.NodeSelectorSpec;
import sapphire.kernel.common.ServerInfo;

public class KernelServerManagerTest {
    private static final String LABEL1_PREFIX = "label1_";
    private static final String LABEL2_PREFIX = "label2_";
    private static final String NON_EXISTENT_LABEL = "non_existent_label";
    private int numOfServers = 10;
    private KernelServerManager manager;

    @Before
    public void setup() throws Exception {
        manager = new KernelServerManager();
        registerServers(manager, numOfServers);
    }

    @Test
    public void testAndLabelSetWithSingleLabel() {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addAndLabel(LABEL1_PREFIX + "1");
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).getPort());
    }

    @Test
    public void testAndLabelSetWithMultiLabels() {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addAndLabel(LABEL1_PREFIX + "1");
        spec.addAndLabel(LABEL2_PREFIX + "1");
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).getPort());
    }

    @Test
    public void testAndLabelSetWithNonExistingLabel() {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addAndLabel(NON_EXISTENT_LABEL);
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testOrLabelSetWithSingleLabel() throws Exception {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addOrLabel(LABEL1_PREFIX + "1");
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).getPort());
    }

    @Test
    public void testOrLabelSetWithNonExistingLabel() throws Exception {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addOrLabel(LABEL1_PREFIX + "1");
        spec.addOrLabel(NON_EXISTENT_LABEL);
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).getPort());
    }

    @Test
    public void testEmptyLabelSet() throws Exception {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(10, result.size());
    }

    @Test
    public void testAndLabelSetOrLabelSetFailure1() throws Exception {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addAndLabel(NON_EXISTENT_LABEL);
        spec.addOrLabel(LABEL1_PREFIX + "1");
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testAndLabelSetOrLabelSetFailure2() throws Exception {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addAndLabel(LABEL1_PREFIX + "1");
        spec.addOrLabel(NON_EXISTENT_LABEL);
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testAndLabelSetOrLabelSetSuccess() throws Exception {
        NodeSelectorSpec spec = new NodeSelectorSpec();
        spec.addAndLabel(LABEL1_PREFIX + "1");
        spec.addAndLabel(LABEL2_PREFIX + "1");
        spec.addOrLabel(NON_EXISTENT_LABEL);
        spec.addOrLabel(LABEL1_PREFIX + "1");
        List<InetSocketAddress> result = manager.getServers(spec);
        Assert.assertEquals(1, result.size());
        Assert.assertEquals(1, result.get(0).getPort());
    }

    private void registerServers(KernelServerManager manager, int numOfServers) throws Exception {
        for (int i = 0; i < numOfServers; i++) {
            ServerInfo s = new ServerInfo(new InetSocketAddress(i), "region_" + i);
            Set<String> labels = new HashSet<>();
            labels.add(LABEL1_PREFIX + i);
            labels.add(LABEL2_PREFIX + i);
            s.addLabels(labels);
            manager.registerKernelServer(s);
        }
    }
}