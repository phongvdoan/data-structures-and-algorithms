package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    Tree<Object> inputTree;

    @Before
    public void setup() {
        inputTree = new Tree<>();
        inputTree.root = new Node<>(5);
        inputTree.root.leftNode = new Node<>(15);
        inputTree.root.rightNode = new Node<>(20);
        inputTree.root.leftNode.leftNode = new Node<>(2);
        inputTree.root.leftNode.rightNode = new Node<>(9);
        inputTree.root.rightNode.leftNode = new Node<>(18);
        inputTree.root.rightNode.rightNode = new Node<>(97);
    }

    @Test
    public void fizzBuzzTree() {
        Tree resultTree = FizzBuzzTree.FizzBuzzTree(inputTree);
        assertEquals("Buzz", resultTree.root.value);
        assertEquals("FizzBuzz", resultTree.root.leftNode.value);
        assertEquals("Buzz",resultTree.root.rightNode.value);
        assertEquals("2",resultTree.root.leftNode.leftNode.value);
        assertEquals("Fizz",resultTree.root.leftNode.rightNode.value);
        assertEquals("Fizz",resultTree.root.rightNode.leftNode.value);
        assertEquals("97",resultTree.root.rightNode.rightNode.value );
    }
}