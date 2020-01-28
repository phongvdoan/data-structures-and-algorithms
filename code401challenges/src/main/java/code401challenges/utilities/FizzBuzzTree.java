package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree<E> {

    public static Tree<Object> FizzBuzzTree(Tree<Object> inputTree) {
        FizzBuzzTree(inputTree.root);
        return inputTree;

    }

    private static void FizzBuzzTree(Node<Object> root){

        if(root != null) {
            FizzBuzzTree(root.leftNode);
            FizzBuzzTree(root.rightNode);
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
