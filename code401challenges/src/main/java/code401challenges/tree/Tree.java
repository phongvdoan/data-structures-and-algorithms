package code401challenges.tree;

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

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
