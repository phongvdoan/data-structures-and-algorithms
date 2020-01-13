//https://stackoverflow.com/questions/12631333/initializing-singly-linked-list-java
package code401challenges.linkedList;

import code401challenges.InvalidInputException;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.StringJoiner;

public class LinkedList {

     public Node head;

    public LinkedList() {
        this.head = null;
    }

    //https://www.youtube.com/watch?v=SMIq13-FZSE
    // this adds to the beginning versus the video shows to add to the end.
    public void insert(Integer value) throws NullArgumentException {
            this.head = new Node(value, this.head);
    }

    public boolean includes(Integer value) throws InvalidInputException {
        if (value instanceof Integer ) {

            Node currentNode = this.head;
            while (currentNode != null) {
                if (currentNode.value == value) {
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        } else {
            throw new InvalidInputException("Value is not a number");
        }
    }

    public String toString() throws NullPointerException {
        Node currentNode = this.head;
        StringJoiner result = new StringJoiner(" } -> { ", "{ ", " }");
        while(currentNode != null){
            result.add(String.valueOf(currentNode.value));
            currentNode = currentNode.next;

        }
        result.add("NULL");
        return result.toString();
    }

}
