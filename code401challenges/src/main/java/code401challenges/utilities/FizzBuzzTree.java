package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

//import java.util.NoSuchElementException;

public class FizzBuzzTree {

    public static Tree<String> fizzBuzzTree(Tree<Integer> inputTree) {
//      if(inputTree.root == null) {
//            throw new NoSuchElementException("Its empty");
//        }
        Tree<String> newTree = new Tree<>();
        newTree.root = fizzBuzzTree(inputTree.root);
        return newTree;

    }

    private static Node<String> fizzBuzzTree(Node<Integer> root){
        Node<String> newNode = new Node<>();
        if(root != null) {
            Node<String> left = fizzBuzzTree(root.leftNode);
            Node<String> right  = fizzBuzzTree(root.rightNode);
            newNode.value = fizzBuzzConvert(root.value);
            newNode.leftNode = left;
            newNode.rightNode = right;
        }
        return newNode;
    }

    private static String fizzBuzzConvert(int number){

        if (number % 3 == 0 && number % 5 == 0) {
            return  "FizzBuzz";
        } else if(number % 5 == 0) {
            return "Buzz";
        } else if(number % 3 == 0) {
            return  "Fizz";
        }else {
            return String.format("%d", number);
        }

    }
}
