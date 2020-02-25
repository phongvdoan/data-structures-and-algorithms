package code401challenges.graph;

import java.util.LinkedList;
import java.util.List;

public class Node<E> {
    public E value;
    public List<Edge<E>> edges = new LinkedList<>();

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

    public E getValue() {
        return value;
    }

    public List<Edge<E>> getEdges() {
        return edges;
    }
}
