package code401challenges.hashtable;

public class Node<E> {

    String key;
    E value;
    Node<E> nextNode;

    public Node(String key, E value, Node<E> nextNode) {
        this.key = key;
        this.value = value;
        this.nextNode = nextNode;
    }

    public Node(){
        this.nextNode = null;
    }
}
