package code401challenges.stacksandqueues;

import java.util.EmptyStackException;
import java.util.StringJoiner;

public class Stack <E> {

    public Node <E> top;

    public Stack() {
        this.top = null;
    }

    public void push(E loneValue) {
        this.top = new Node <> (loneValue, this.top);
    }

    public E pop() {
        if (this.top == null){
            System.out.println("This stack is empty");
            throw new EmptyStackException();
        }
        E loneValue = this.top.value;
        this.top = this.top.next;
        return loneValue;
    }

    public E peek(){
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
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
