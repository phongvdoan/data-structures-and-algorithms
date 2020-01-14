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
    public void append(int value) {
        Node node = new Node( value, null);
        if ( head == null){
            head = node;
        } else {
            Node currentNode = head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }

    }

    public void insertBefore(int previousVal, int newVal) {


        if(this.head.value == previousVal){
            this.head = new Node(newVal, this.head);
        }
        Node currentNode = head;
        while(currentNode.next != null) {

            if(currentNode.next.value == previousVal) {
                currentNode.next = new Node(newVal, currentNode.next);
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertAfter(int previousVal, int newVal) {

        Node currentNode = head;
        while(currentNode.next != null) {
            if(currentNode.value == previousVal) {
                currentNode.next = new Node(newVal, currentNode.next);
            }
            currentNode = currentNode.next;
        }
    }

    public void delete(int value ){
        Node currentNode = this.head;
        if(head.value == value){
            head = currentNode.next;
        }
        while (currentNode.next != null){
            if (currentNode.next.value == value){
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
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
