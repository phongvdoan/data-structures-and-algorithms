package code401challenges.graph;

public  class Edge<E> {
    public int weight;
    public Node<E> nextNode;

    public Edge(int weight, Node<E> nextNode) {
        this.weight = weight;
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", nextNode=" + nextNode.value +
                '}';
    }
}
