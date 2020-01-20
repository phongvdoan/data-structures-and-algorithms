package code401challenges.stacksandqueues;

import java.util.StringJoiner;

public class Queue {
    Node front;
    Node back;

    public Queue() {
        this.front = null;
    }

    public void enqueue(int value){
        Node node = new Node( value, null);
        Node currentNode = this.back;
        if(this.front == null){
            this.front = node;
            this.back = node;
        } else {
            currentNode.next = node;
            this.back = node;
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
