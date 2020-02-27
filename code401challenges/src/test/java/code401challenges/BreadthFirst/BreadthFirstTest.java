package code401challenges.BreadthFirst;

import code401challenges.graph.Graph;
import code401challenges.graph.Node;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BreadthFirstTest {

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
    public void TestBreadthFirstTraversal() {
        List<Node<String>> resultList = testStringGraph.breadthFirstTraversal(maya);
        assertEquals("[Node{value=Maya, edges=[Edge{weight=1, nextNode=Phong}]}, Node{value=Phong, edges=[Edge{weight=2, nextNode=Mani}]}, Node{value=Mani, edges=[Edge{weight=2, nextNode=Janai}]}, Node{value=Janai, edges=[Edge{weight=1, nextNode=Maya}]}]", resultList.toString());
    }

    @Test
    public void TestBreadthFirstTraversal_TestTwo() {
        List<Node<String>> resultList = testStringGraph.breadthFirstTraversal(phong);
        assertEquals("[Node{value=Phong, edges=[Edge{weight=2, nextNode=Mani}]}, Node{value=Mani, edges=[Edge{weight=2, nextNode=Janai}]}, Node{value=Janai, edges=[Edge{weight=1, nextNode=Maya}]}, Node{value=Maya, edges=[Edge{weight=1, nextNode=Phong}]}]", resultList.toString());
    }

    @Test
    public void TestBreadthFirstTraversal_TestThree() {
        List<Node<String>> resultList = testStringGraph.breadthFirstTraversal(mani);
        assertEquals("[Node{value=Mani, edges=[Edge{weight=2, nextNode=Janai}]}, Node{value=Janai, edges=[Edge{weight=1, nextNode=Maya}]}, Node{value=Maya, edges=[Edge{weight=1, nextNode=Phong}]}, Node{value=Phong, edges=[Edge{weight=2, nextNode=Mani}]}]", resultList.toString());
    }
}