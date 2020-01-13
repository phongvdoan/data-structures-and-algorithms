//https://stackoverflow.com/questions/12631333/initializing-singly-linked-list-java
package code401challenges.linkedList;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(Integer value) {
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

    public boolean includes(Integer value) {
        Node currentNode = this.head;
        while(currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public String toString() {
        Node currentNode = this.head;
        String result = "The current values are: ";
        while(currentNode != null){
            result += "{ " + currentNode.value + " } -> ";
            currentNode = currentNode.next;

        }
        result += "{  NULL  } ";
        return result;
    }

}
