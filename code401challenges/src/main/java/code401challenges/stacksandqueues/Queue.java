package code401challenges.stacksandqueues;

import java.util.StringJoiner;

public class Queue <E> {
    Node <E> front;
    Node <E> back;

    public Queue() {
        this.front = null;
    }

    public void enqueue(E value){
        Node <E> node = new Node( value, null);
        Node <E> currentNode = this.back;
        if(this.front == null){
            this.front = node;
            this.back = node;
        } else {
            currentNode.next = node;
            this.back = node;
        }


    }

    public E dequeue(){
        E loneValue = this.front.value;
        this.front = this.front.next;
        return loneValue;
    }

    public E peek(){
        E loneValue = this.front.value;
        return loneValue;
    }

    public boolean isEmpty() {
        if (this.front == null) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        Node currentNode = this.front;
        StringJoiner result = new StringJoiner(" } -> { ", "{ ", " }");
        while(currentNode != null){
            result.add(String.valueOf(currentNode.value));
            currentNode = currentNode.next;

        }
        result.add("NULL");
        return result.toString();
    }

}
