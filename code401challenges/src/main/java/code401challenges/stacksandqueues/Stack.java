package code401challenges.stacksandqueues;

import java.util.StringJoiner;

public class Stack <E> {

    public Node <E> top;

    public Stack() {
        this.top = null;
    }

    public void push(int loneValue) {
        this.top = new Node(loneValue, this.top);
    }

    public E pop() {
        E loneValue = this.top.value;
        this.top = this.top.next;
        return loneValue;
    }

    public E peek(){
        E loneValue = this.top.value;
        return loneValue;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public String toString() {
        Node currentNode = this.top;
        StringJoiner result = new StringJoiner(" } \n { ", "{ ", " }");
        while(currentNode != null){
            result.add(String.valueOf(currentNode.value));
            currentNode = currentNode.next;

        }
        result.add("NULL");
        return result.toString();
    }
}
