package code401challenges.tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Tree {

    Node root;
    ArrayList <Integer> preOrderArr;
    ArrayList <Integer> inOrderArr;
    ArrayList <Integer> postOrderArr;

    public Tree() {
        this.root = null;
        preOrderArr = new ArrayList<>();
        inOrderArr = new ArrayList<>();
        postOrderArr = new ArrayList<>();

    }

    public Object[] preorder(){
        return preorder(root);
    }

    private Object[] preorder(Node root){

        if (root != null) {
           preOrderArr.add(root.value);
            preorder(root.leftNode);
            preorder(root.rightNode);
        }

        return preOrderArr.toArray();
    }

    public Object[] inOrder(){
        return inOrder(root);
    }

    private Object[] inOrder(Node root) {
        if(root != null){
            inOrder(root.leftNode);
            inOrderArr.add(root.value);
            inOrder(root.rightNode);
        }
        return inOrderArr.toArray();
    }

    public Object[] postOrder(){
        return postOrder(root);
    }


    private Object[] postOrder(Node root) {
        if(root != null){
            postOrder(root.leftNode);
            postOrder(root.rightNode);
            postOrderArr.add(root.value);
        }
        return postOrderArr.toArray();
    }


}
