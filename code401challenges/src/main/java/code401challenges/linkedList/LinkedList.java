//https://stackoverflow.com/questions/12631333/initializing-singly-linked-list-java
package code401challenges.linkedList;

import code401challenges.InvalidInputException;
import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    //https://www.youtube.com/watch?v=SMIq13-FZSE
    public void append(int value)throws NullArgumentException {
        Node node = new Node( value, null);
        if ( this.head == null){
            this.head = node;
        } else {
            Node currentNode = this.head;
            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }

    }

    public void insertBefore(int previousVal, int newVal)throws NoSuchElementException {


        if(this.head.value == previousVal){
            this.head = new Node(newVal, this.head);
        }
        Node currentNode = this.head;
        while(currentNode.next != null) {

            if(currentNode.next.value == previousVal) {
                currentNode.next = new Node(newVal, currentNode.next);
                break;
            }
            currentNode = currentNode.next;
        }
    }

    public void insertAfter(int previousVal, int newVal)throws NoSuchElementException {

        Node currentNode = this.head;
        while(currentNode != null) {
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

    public boolean includes(Integer value) throws NoSuchElementException {

            Node currentNode = this.head;
            while (currentNode != null) {
                if (currentNode.value == value) {
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
    }
    public int size(){
        int counter = 0;
        Node current = this.head;
        while (current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }

    public int kthFromEnd(int k) {
        int counter = this.size();

        if(k > counter){
            throw new OutOfRangeException(k, 0, counter);
        }
        for(int i = 1; i < (counter - k); i++){
            this.head = this.head.next;
        }
        return this.head.value;
    }

    public static LinkedList mergeList(LinkedList listOne, LinkedList listTwo) {
        if(listOne.head == null){
            return listTwo;
        }


        Node one = listOne.head;
        Node two = listTwo.head;
        while(one != null && two != null) {
            Node tempOne = one.next;
            Node tempTwo = two.next;
            if (one.next != null){
                two.next = one.next;
            }
            one.next = two;
            one = tempOne;
            two = tempTwo;
        }
        return listOne;
    }

    public static Node mergeListTwo(Node listOne, Node listTwo){
        if(listOne == null) {
            return listTwo;
        } else {
            listOne.next = mergeListTwo(listTwo, listOne.next);
            return listOne;
        }
    }

    public String toString() {
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
