package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.NoSuchElementException;

public class FizzBuzzTree {

    public static Tree<Object> fizzBuzzTree(Tree<Object> inputTree) {
      if(inputTree.root == null) {
            throw new NoSuchElementException("Its empty");
        }
        fizzBuzzTree(inputTree.root);
        return inputTree;

    }

    private static void fizzBuzzTree(Node<Object> root){

        if(root != null) {
            fizzBuzzTree(root.leftNode);
            fizzBuzzTree(root.rightNode);
            if ((Integer) root.value % 3 == 0 && (Integer) root.value % 5 == 0) {
                root.value = "FizzBuzz";
            } else if((Integer) root.value % 5 == 0) {
                root.value = "Buzz";
            } else if((Integer) root.value % 3 == 0) {
                root.value = "Fizz";
            }else {
                root.value = String.format("%d", root.value);
            }
        }
    }
}
