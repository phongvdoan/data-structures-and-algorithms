package code401challenges.tree;

import java.util.ArrayList;
import java.util.NoSuchElementException;


// https://howtodoinjava.com/java/collections/arraylist/convert-arraylist-to-array/
//used to convert ArrayList to arrays and print them out
public class Tree {

    Node root;

    public Tree() {
        this.root = null;
    }

    public Integer[] preorder(){
        ArrayList<Integer> preOrderArr = new ArrayList<>();
        if(root == null){
            throw new NoSuchElementException("There are no Nodes in the tree.");
        }
        return preorder(root, preOrderArr);
    }

    private Integer[] preorder(Node root, ArrayList<Integer> preOrderArr){

        if (root != null) {
           preOrderArr.add(root.value);
            preorder(root.leftNode, preOrderArr);
            preorder(root.rightNode,preOrderArr);
        }

        return preOrderArr.toArray(new Integer[preOrderArr.size()]);
    }

    public Integer[] inOrder(){
        ArrayList <Integer> inOrderArr = new ArrayList<>();

        if(root == null){
            throw new NoSuchElementException("There are no Nodes in the tree.");
        }
        return inOrder(root, inOrderArr);
    }

    private Integer[] inOrder(Node root, ArrayList <Integer> inOrderArr) {
        if(root != null){
            inOrder(root.leftNode, inOrderArr);
            inOrderArr.add(root.value);
            inOrder(root.rightNode, inOrderArr);
        }
        return inOrderArr.toArray(new Integer[inOrderArr.size()]);
    }

    public Integer[] postOrder(){
        ArrayList <Integer> postOrderArr = new ArrayList<>();

        if(root == null){
            throw new NoSuchElementException("There are no Nodes in the tree.");
        }

        return postOrder(root, postOrderArr);
    }


    private Integer[] postOrder(Node root, ArrayList <Integer> postOrderArr) {
        if(root != null){
            postOrder(root.leftNode, postOrderArr);
            postOrder(root.rightNode,postOrderArr);
            postOrderArr.add(root.value);
        }
        return postOrderArr.toArray(new Integer[postOrderArr.size()]);
    }


}
