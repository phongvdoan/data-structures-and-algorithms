//https://stackoverflow.com/questions/12631333/initializing-singly-linked-list-java
package code401challenges.linkedList;

import org.apache.commons.math3.exception.NullArgumentException;
import org.apache.commons.math3.exception.OutOfRangeException;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class LinkedList <E> {

    public Node <E> head;

    public LinkedList() {
        this.head = null;
    }

    //https://www.youtube.com/watch?v=SMIq13-FZSE
    public void append(E value)throws NullArgumentException {
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

    public void insertBefore(E previousVal, E newVal)throws NoSuchElementException {


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

    public void insertAfter(E previousVal, E newVal)throws NoSuchElementException {

        Node currentNode = this.head;
        while(currentNode != null) {
            if(currentNode.value == previousVal) {
                currentNode.next = new Node(newVal, currentNode.next);
            }
            currentNode = currentNode.next;
        }
    }

    public void delete(E value ){
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
    public void insert(E value) throws NullArgumentException {
            this.head = new Node(value, this.head);
    }

    public boolean includes(E value) throws NoSuchElementException {

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
//        int counter = 0;
//        Node current = this.head;
//        while (current != null){
//            counter++;
//            current = current.next;
//        }
        return size(this.head);
    }

    private int size(Node currentNode) {
        if(currentNode == null){
            return 0;
        } else {
            return 1 + size(currentNode.next);
        }
    }

    public E kthFromEnd(int k) {
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
//        if(listOne.head == null){
//            return listTwo;
//        }
//
//
//        Node one = listOne.head;
//        Node two = listTwo.head;
//        while(one != null && two != null) {
//            Node tempOne = one.next;
//            Node tempTwo = two.next;
//            if (one.next != null){
//                two.next = one.next;
//            }
//            one.next = two;
//            one = tempOne;
//            two = tempTwo;
//        }
//        return listOne;
        Node list1Head = listOne.head;
        Node list2Head = listTwo.head;
        listOne.head = mergeList(list1Head,list2Head);
        return listOne;
    }

    private static Node mergeList(Node listOneHead, Node listTwoHead){
        if(listOneHead == null) {
            return listTwoHead;
        } else {
            listOneHead.next = mergeList(listTwoHead, listOneHead.next);
            return listOneHead;
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
