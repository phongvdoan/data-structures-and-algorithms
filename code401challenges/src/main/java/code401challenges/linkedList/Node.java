package code401challenges.linkedList;

public class Node <E> {

    public E value;
    public Node <E> next;

    public Node (E value, Node next) {
        this.value = value;
        this.next = next;
    }


}
