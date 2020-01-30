package code401challenges.tree;

import code401challenges.stacksandqueues.Queue;
import org.apache.commons.math3.exception.NullArgumentException;

import java.util.ArrayList;
import java.util.NoSuchElementException;


// https://howtodoinjava.com/java/collections/arraylist/convert-arraylist-to-array/
//used to convert ArrayList to arrays and print them out
public class Tree<E> {

    public Node<E> root;

    public Tree() {
        this.root = null;
    }

    public Integer[] preOrder(){
        ArrayList<E> preOrderArr = new ArrayList<>();
        if(root == null){
            throw new NoSuchElementException("There are no Nodes in the tree.");
        }

        return preOrder(root, preOrderArr).toArray(new Integer[preOrderArr.size()]);
    }

    private ArrayList<E> preOrder(Node<E> root, ArrayList<E> preOrderArr){

        if (root != null) {
           preOrderArr.add(root.value);
            preOrder(root.leftNode, preOrderArr);
            preOrder(root.rightNode,preOrderArr);
        }

        return preOrderArr;
    }

    public Integer[] inOrder(){
        ArrayList <E> inOrderArr = new ArrayList<>();

        if(root == null){
            throw new NoSuchElementException("There are no Nodes in the tree.");
        }
        return inOrder(root, inOrderArr);
    }

    private Integer[] inOrder(Node<E> root, ArrayList <E> inOrderArr) {
        if(root != null){
            inOrder(root.leftNode, inOrderArr);
            inOrderArr.add(root.value);
            inOrder(root.rightNode, inOrderArr);
        }
        return inOrderArr.toArray(new Integer[inOrderArr.size()]);
    }

    public Integer[] postOrder(){
        ArrayList <E> postOrderArr = new ArrayList<>();

        if(root == null){
            throw new NoSuchElementException("There are no Nodes in the tree.");
        }

        return postOrder(root, postOrderArr);
    }


    private Integer[] postOrder(Node<E> root, ArrayList <E> postOrderArr) {
        if(root != null){
            postOrder(root.leftNode, postOrderArr);
            postOrder(root.rightNode,postOrderArr);
            postOrderArr.add(root.value);
        }
        return postOrderArr.toArray(new Integer[postOrderArr.size()]);
    }

    public ArrayList<Object> breathFirstTraversal(){
        ArrayList<Object> treeList = new ArrayList<>();
        breathFirstTraversal(this.root, treeList);
        return treeList;

    }

    private void breathFirstTraversal(Node<E> root, ArrayList<Object> treeList){
        Queue<Node> treeQueue = new Queue<>();
        treeQueue.enqueue(root);
        while(!treeQueue.isEmpty()){
            Node<E> traversalNode = treeQueue.dequeue();
            treeList.add(traversalNode.value);
            if(traversalNode.leftNode != null){
                treeQueue.enqueue(traversalNode.leftNode);
            }
            if(traversalNode.rightNode != null){
                treeQueue.enqueue(traversalNode.rightNode);
            }

        }
    }

    public int find_maximum_value(){
        int highestValu = Integer.MIN_VALUE;
        return find_maximum_value( root, highestValu);


    }

    private int find_maximum_value(Node<E> root, int highestValu){
        if(root == null){
            throw new NullArgumentException();
        }
        Queue<Node> treeQueue = new Queue<>();
        treeQueue.enqueue(root);
        while(!treeQueue.isEmpty()){
            Node traversalNode = treeQueue.dequeue();
            if((Integer) traversalNode.value > highestValu){
                highestValu = (Integer) traversalNode.value;
            }
            if(traversalNode.leftNode != null){
                treeQueue.enqueue(traversalNode.leftNode);
            }
            if(traversalNode.rightNode != null){
                treeQueue.enqueue(traversalNode.rightNode);
            }
        }
        return highestValu;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
