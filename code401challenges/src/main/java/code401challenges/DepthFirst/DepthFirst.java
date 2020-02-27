package code401challenges.DepthFirst;

import code401challenges.graph.Edge;
import code401challenges.graph.Node;
import code401challenges.stacksandqueues.Stack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DepthFirst<E> {

    List<Node<E>> output;

    public DepthFirst() {
    }

    public List<Node<E>> depthfirst(Node<E> root) {
        Set<Node<E>> seenSet = new HashSet<>();
        Stack<Node<E>> needsToProcess = new Stack<>();
        List<Node<E>> resultList = new LinkedList<>();

        needsToProcess.push(root);
        while(!needsToProcess.isEmpty()) {
            Node<E> currentNode = needsToProcess.pop();
            if(!seenSet.contains(currentNode)){
                resultList.add(currentNode);
                seenSet.add(currentNode);
                for(int i = 0; i < currentNode.edges.size(); i++) {
                    Edge<E> currentEdge = currentNode.getEdges().get(i);
                    if(!seenSet.contains(currentEdge.nextNode)){
                        needsToProcess.push(currentEdge.nextNode);
                    }
                }

            }

        }
        return resultList;
    }
}
