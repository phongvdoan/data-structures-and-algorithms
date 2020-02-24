package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;
import code401challenges.graph.Graph.*;

import static org.junit.Assert.*;

public class GraphTest {
    Graph<Integer> testGraphOne;
    Graph<String> testGraphTwo;
    Node<Integer> testNodeOne;
    Node<Integer> testNodeTwo;
    Node<Integer> testNodeThree;
    Node<Integer> testNodeFour;
    Node<String> testNodeOneString;
    Node<String> testNodeTwoString;
    Node<String> testNodeThreeString;
    Node<String> testNodeFourString;


    @Before
    public void setup(){
        testGraphOne = new Graph<>();
        testGraphTwo = new Graph<>();
        testNodeOne = testGraphOne.addNode(10);
        testNodeTwo = testGraphOne.addNode(20);
        testNodeThree = testGraphOne.addNode(5);
        testNodeFour = testGraphOne.addNode(6);
        testNodeOneString = testGraphTwo.addNode("Phong");
        testNodeTwoString = testGraphTwo.addNode("Mani");
        testNodeThreeString = testGraphTwo.addNode("Janai");
        testNodeFourString = testGraphTwo.addNode("Maya");
    }

    @Test
    public void TestAddNode_Method() {
        assertEquals("Node{value=15, edges=[]}", testGraphOne.addNode(15).toString());
        assertEquals("Node{value=Blaze, edges=[]}", testGraphTwo.addNode("Blaze").toString());
    }

    @Test
    public void addEdge() {
        Node<Integer> intNode = testGraphOne.addNode(19);
        Node<Integer> integerNode = testGraphOne.addNode(15);
        Node<String> stringNode = testGraphTwo.addNode("DOG");
        assertEquals("Node{value=19, edges=[]}", intNode.toString());
        testGraphOne.addEdge(integerNode,intNode, 5);
        assertEquals("Node{value=19, edges=[Edge{weight=5, nextNode=Node{value=15, edges=[]}}]}", intNode.toString());
        assertEquals("Node{value=DOG, edges=[]}", stringNode.toString());
        testGraphTwo.addEdge(stringNode, testNodeFourString, 6);
        assertEquals("Node{value=Maya, edges=[Edge{weight=6, nextNode=Node{value=DOG, edges=[]}}]}", testNodeFourString.toString());
    }

    @Test
    public void size() {
        int expectedGraphOne = 4;
        int expectedGraphTwo = 4;
        assertEquals(expectedGraphOne, testGraphOne.size());
        assertEquals(expectedGraphTwo, testGraphTwo.size());
        testGraphOne.addNode(19);
        testGraphOne.addNode(15);
        testGraphTwo.addNode("DOG");
        assertEquals(6, testGraphOne.size());
        assertEquals(5, testGraphTwo.size());

    }

    @Test
    public void getNodes() {
        assertEquals("[Node{value=10, edges=[]}, Node{value=20, edges=[]}, Node{value=5, edges=[]}, Node{value=6, edges=[]}]", testGraphOne.getNodes().toString());

        assertEquals("[Node{value=Phong, edges=[]}, Node{value=Mani, edges=[]}, Node{value=Janai, edges=[]}, Node{value=Maya, edges=[]}]", testGraphTwo.getNodes().toString());
    }

    @Test
    public void getNeighbors() {
        Node<String> stringNode = testGraphTwo.addNode("DOG");
        testGraphTwo.addEdge(stringNode, testNodeFourString, 6);
        assertEquals("{Node{value=DOG, edges=[]}=6}", testGraphTwo.getNeighbors(testNodeFourString).toString());
        testGraphOne.addEdge(testNodeOne,testNodeTwo,3);
        assertEquals("{Node{value=10, edges=[]}=3}", testGraphOne.getNeighbors(testNodeTwo).toString());
    }

    @Test
    public void testOneNodeInGraph(){
        Graph<Integer> oneNodeGraph = new Graph<>();
        oneNodeGraph.addNode(5);
        assertEquals("[Node{value=5, edges=[]}]", oneNodeGraph.getNodes().toString());
    }

    @Test
    public void testNoNodesInGraph() {
        Graph<String> noNodeGraph = new Graph<>();
        assertNull(noNodeGraph.getNodes());
    }
}