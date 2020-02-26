package code401challenges.GetEdge;

import code401challenges.graph.Graph;
import code401challenges.graph.Node;
import org.junit.Before;
import org.junit.Test;

import static code401challenges.GetEdge.GetEdge.*;
import static org.junit.Assert.*;

public class GetEdgeTest {

    Graph<String> testStringGraph;
    Node<String> pandora;
    Node<String> arendelle;
    Node<String> metroville;
    Node<String> monstropolis;
    Node<String> naboo;
    Node<String> narnia;

    @Before
    public void setup(){
        testStringGraph = new Graph<>();
        pandora = testStringGraph.addNode("Pandora");
        arendelle = testStringGraph.addNode("Arendelle");
        metroville = testStringGraph.addNode("Metroville");
        naboo = testStringGraph.addNode("Naboo");
        monstropolis = testStringGraph.addNode("Monstropolis");
        narnia = testStringGraph.addNode("Narnia");
        testStringGraph.addEdge(arendelle, pandora, 150);
        testStringGraph.addEdge(metroville, pandora, 82);
        testStringGraph.addEdge(metroville, arendelle, 99);
        testStringGraph.addEdge(monstropolis, arendelle, 42);
        testStringGraph.addEdge(metroville, monstropolis, 105);
        testStringGraph.addEdge(naboo, monstropolis, 73);
        testStringGraph.addEdge(metroville, naboo, 26);
        testStringGraph.addEdge(narnia, naboo, 250);
        testStringGraph.addEdge(metroville, narnia, 26);

    }

    @Test
    public void testGetGraph(){
        String[] stringArr = new String[]{"Metroville", "Pandora"};
        GetEdge.DirectFlight result = getEdge(testStringGraph,stringArr);
        assertTrue(result.neighboringNode);
        assertEquals( 82, result.cost);
    }

    @Test
    public void testGetGraphTwo(){
        String[] stringArr = new String[]{"Arendelle","Monstropolis", "Naboo"};
        DirectFlight result = getEdge(testStringGraph,stringArr);
        assertTrue(result.neighboringNode);
        assertEquals( 115, result.cost);
    }

    @Test
    public void testGetGraphThree(){
        String[] stringArr = new String[]{"Naboo","Pandora"};
        DirectFlight result = getEdge(testStringGraph,stringArr);
        assertFalse(result.neighboringNode);
        assertEquals( 0, result.cost);
    }

    @Test
    public void testGetGraphFour(){
        String[] stringArr = new String[]{"Narnia","Arendelle", "Naboo"};
        DirectFlight result = getEdge(testStringGraph,stringArr);
        assertFalse(result.neighboringNode);
        assertEquals( 0, result.cost);
    }

}