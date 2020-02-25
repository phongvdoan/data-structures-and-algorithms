package code401challenges.graph;

import code401challenges.BreadthFirst.BreadthFirst;

import java.util.*;

public class Graph <E> extends BreadthFirst<E> {

    ArrayList<Node<E>> vertices = new ArrayList<>();

    public Graph() {
    }


    public Node<E> addNode(E value) {
        Node<E> newNode = new Node<>(value);
        vertices.add(newNode);
        return  newNode;
    }

    public void addEdge (Node<E> toNode, Node<E> fromNode, int weight){

        Edge<E> newEdge = new Edge<>(weight,toNode);
        fromNode.edges.add(newEdge);
    }

    public int size(){
        return vertices.size();
    }

    public List<Node<E>> getNodes(){
        if(vertices.size() == 0){
            return null;
        }
        return new LinkedList<>(vertices);
    }

    public Map<Node<E>, Integer> getNeighbors(Node<E> node){
        Map<Node<E>, Integer> neighboringNodes = new HashMap<>();
        if(node == null || node.edges == null){
            return null;
        }
        for (Edge<E> neighbor: node.edges) {
            neighboringNodes.put(neighbor.nextNode, neighbor.weight);
        }
        return neighboringNodes;
    }



}
