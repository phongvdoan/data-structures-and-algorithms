package code401challenges.BreadthFirst;



import code401challenges.graph.Edge;
import code401challenges.graph.Graph;
import code401challenges.graph.Node;
import code401challenges.stacksandqueues.Queue;
import code401challenges.stacksandqueues.Stack;

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
        List<Node<String>> resultListDFS = testStringGraph.depthfirst(maya);
        System.out.println(resultListDFS);
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

    public  List<Node<E>> depthfirst(Node<E> node) {
        Set<Node<E>> seenSet = new HashSet<>();
        Stack<Node<E>> needsToProcess = new Stack<>();
        List<Node<E>> resultList = new LinkedList<>();

        needsToProcess.push(node);
        while(!needsToProcess.isEmpty()) {
            Node<E> currentNode = needsToProcess.pop();
            if(!seenSet.contains(currentNode)){
                resultList.add(currentNode);
                for(Edge<E> edge : currentNode.edges) {
                    if(!seenSet.contains(edge.nextNode)){
                        needsToProcess.push(edge.nextNode);
                    }
                }
                seenSet.add(currentNode);
            }

        }
        return resultList;
    }
}
