package code401challenges.BreadthFirst;


import code401challenges.graph.Edge;
import code401challenges.graph.Graph;
import code401challenges.graph.Node;
import code401challenges.stacksandqueues.Queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BreadthFirst<E> {
    public static void main(String[] args){
        Graph<String> testStringGraph = new Graph<>();
        Node<String> phong = testStringGraph.addNode("Phong");
        Node<String> maya = testStringGraph.addNode("Maya");
        Node<String> mani = testStringGraph.addNode("Mani");
        Node<String> janai = testStringGraph.addNode("Janai");
        testStringGraph.addEdge(phong,maya, 1);
        testStringGraph.addEdge(mani, janai, 1);
        testStringGraph.addEdge(mani, phong,2);
        testStringGraph.addEdge(janai, maya,2);
        List<Node<String>> resultList = testStringGraph.breadthFirstTraversal(maya);
        System.out.println(resultList.toString());
    }



    public  List<Node<E>> breadthFirstTraversal(Node<E> node) {
        Set<Node<E>> seenSet = new HashSet<>();
        Queue<Node<E>> needsToProcess = new Queue<>();
        List<Node<E>> resultList = new LinkedList<>();
        seenSet.add(node);
        needsToProcess.enqueue(node);
        while(!needsToProcess.isEmpty()) {
            Node<E> currentNode = needsToProcess.dequeue();
            for(int i = 0; i < currentNode.edges.size(); i++) {
               Edge<E> currentEdge = currentNode.getEdges().get(i);
               if(!seenSet.contains(currentEdge.nextNode)){
                   seenSet.add(currentEdge.nextNode);
                   needsToProcess.enqueue(currentEdge.nextNode);
               }
            }
            resultList.add(currentNode);
        }
        return resultList;
    }
}
