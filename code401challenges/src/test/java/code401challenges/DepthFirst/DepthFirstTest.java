package code401challenges.DepthFirst;

import code401challenges.graph.Graph;
import code401challenges.graph.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DepthFirstTest {
    Graph<String> testStringGraph;
    Node<String> phong;
    Node<String> maya;
    Node<String> mani;
    Node<String> janai;

    @Before
    public void setup(){
        testStringGraph = new Graph<>();
        phong = testStringGraph.addNode("Phong");
        maya = testStringGraph.addNode("Maya");
        mani = testStringGraph.addNode("Mani");
        janai = testStringGraph.addNode("Janai");
        testStringGraph.addEdge(phong,maya, 1);
        testStringGraph.addEdge(maya, janai, 1);
        testStringGraph.addEdge(mani, phong,2);
        testStringGraph.addEdge(janai, mani,2);

    }

    @Test
    public void testDepthFirst() {
        DepthFirst<String> answer = new DepthFirst<>();
        List<Node<String>> result = answer.depthfirst(maya);
        assertEquals("[Node{value=Maya, edges=[Edge{weight=1, nextNode=Phong}, Edge{weight=1, nextNode=Janai}]}, Node{value=Janai, edges=[Edge{weight=1, nextNode=Maya}, Edge{weight=2, nextNode=Mani}]}, Node{value=Mani, edges=[Edge{weight=2, nextNode=Phong}, Edge{weight=2, nextNode=Janai}]}, Node{value=Phong, edges=[Edge{weight=1, nextNode=Maya}, Edge{weight=2, nextNode=Mani}]}]", result.toString() );
    }

    @Test
    public void testDepthFirstTwo() {
        DepthFirst<String> answer = new DepthFirst<>();
        List<Node<String>> result = answer.depthfirst(phong);
        assertEquals("[Node{value=Phong, edges=[Edge{weight=1, nextNode=Maya}, Edge{weight=2, nextNode=Mani}]}, Node{value=Mani, edges=[Edge{weight=2, nextNode=Phong}, Edge{weight=2, nextNode=Janai}]}, Node{value=Janai, edges=[Edge{weight=1, nextNode=Maya}, Edge{weight=2, nextNode=Mani}]}, Node{value=Maya, edges=[Edge{weight=1, nextNode=Phong}, Edge{weight=1, nextNode=Janai}]}]", result.toString() );
    }

    @Test
    public void testDepthFirstThree() {
        DepthFirst<String> answer = new DepthFirst<>();
        List<Node<String>> result = answer.depthfirst(janai);
        assertEquals("[Node{value=Janai, edges=[Edge{weight=1, nextNode=Maya}, Edge{weight=2, nextNode=Mani}]}, Node{value=Mani, edges=[Edge{weight=2, nextNode=Phong}, Edge{weight=2, nextNode=Janai}]}, Node{value=Phong, edges=[Edge{weight=1, nextNode=Maya}, Edge{weight=2, nextNode=Mani}]}, Node{value=Maya, edges=[Edge{weight=1, nextNode=Phong}, Edge{weight=1, nextNode=Janai}]}]", result.toString() );
    }

}