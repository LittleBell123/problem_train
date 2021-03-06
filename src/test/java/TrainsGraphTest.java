import TrainsGraph.TrainGraph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrainsGraphTest {
    private TrainGraph graph;

    @Before
    public void initGraph(){
        String str = "AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7";
        graph = new TrainGraph(str);
    }

    @Test
    public void return_9_when_given_the_route_A_B_C(){
        String path = "A-B-C";
        int result = graph.findDistOfPath(path.split("-"));
        Assert.assertEquals(9, result);
    }

    @Test
    public void return_5_when_given_the_route_A_D(){
        String path = "A-D";
        int result = graph.findDistOfPath(path.split("-"));
        Assert.assertEquals(5,result);
    }

    @Test
    public void return_5_when_given_the_route_A_D_C(){
        String path = "A-D-C";
        int result = graph.findDistOfPath(path.split("-"));
        Assert.assertEquals(13,result);
    }



}
