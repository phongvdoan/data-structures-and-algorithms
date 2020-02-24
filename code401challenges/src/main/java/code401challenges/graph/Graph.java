package code401challenges.graph;

import java.util.*;

public class Graph <E> {

    ArrayList<Node<E>> vertices = new ArrayList<>();

    public Graph() {
    }

    static class Node<E> {
        E value;
        List<Edge<E>> edges = new LinkedList<>();

        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", edges=" + edges +
                    '}';
        }
    }

    static class Edge<E> {
        int weight;
        Node<E> nextNode;

        public Edge(int weight, Node<E> nextNode) {
            this.weight = weight;
            this.nextNode = nextNode;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "weight=" + weight +
                    ", nextNode=" + nextNode +
                    '}';
        }
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
