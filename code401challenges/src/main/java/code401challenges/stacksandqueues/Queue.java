package code401challenges.stacksandqueues;

import java.util.StringJoiner;

public class Queue {
    Node front;

    public Queue() {
        this.front = null;
    }

    public void enqueue(int value){
        Node node = new Node( value, null);
        if ( this.front == null){
            this.front = node;
        } else {
            Node currentNode = this.front;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }

    }

    public int dequeue(){
        int loneValue = this.front.value;
        this.front = this.front.next;
        return loneValue;
    }

    public int peek(){
        int loneValue = this.front.value;
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
