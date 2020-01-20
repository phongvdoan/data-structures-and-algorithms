package code401challenges.stacksandqueues;

import java.util.StringJoiner;

public class Stack {

    public Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int loneValue) {
        this.top = new Node(loneValue, this.top);
    }

    public int pop() {
        int loneValue = this.top.value;
        this.top = this.top.next;
        return loneValue;
    }

    public int peek(){
        int loneValue = this.top.value;
        return loneValue;
    }

    public boolean isEmpty() {
        if(this.top == null){
            return true;
        } else {
            return false;
        }
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
