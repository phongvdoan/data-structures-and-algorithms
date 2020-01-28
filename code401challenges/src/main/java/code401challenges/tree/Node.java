package code401challenges.tree;

public class Node<E> {
    public E value;
    public Node <E>  leftNode;
    public Node <E>  rightNode;

    public Node(E value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public Node() {

    }
}
