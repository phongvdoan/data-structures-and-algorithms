package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;


public class FizzBuzzTreeTest {

    Tree<Integer> inputTree;

    @Before
    public void setupTree() {
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

        Tree<String> resultTree = FizzBuzzTree.fizzBuzzTree(inputTree);
        assertEquals("Buzz", resultTree.root.value);
        assertEquals("FizzBuzz", resultTree.root.leftNode.value);
        assertEquals("Buzz",resultTree.root.rightNode.value);
        assertEquals("2",resultTree.root.leftNode.leftNode.value);
        assertEquals("Fizz",resultTree.root.leftNode.rightNode.value);
        assertEquals("Fizz",resultTree.root.rightNode.leftNode.value);
        assertEquals("97",resultTree.root.rightNode.rightNode.value );

        // Original Tree is kept

        assertTrue(inputTree.root.value == 5);
        assertTrue(inputTree.root.leftNode.value == 15);
        assertTrue(inputTree.root.rightNode.value == 20);
        assertTrue(inputTree.root.leftNode.leftNode.value == 2);
        assertTrue(inputTree.root.leftNode.rightNode.value == 9);
        assertTrue(inputTree.root.rightNode.leftNode.value == 18);
        assertTrue(inputTree.root.rightNode.rightNode.value ==97);
    }

    @Test
//            (expected = NoSuchElementException.class)
    public void fizzBuzzTree_nullTree(){
        Tree<Integer> nullTree = new Tree<>();
        assertNull(FizzBuzzTree.fizzBuzzTree(nullTree).root.value);
    }

    @Test
            (expected = ClassCastException.class)
    public void fizzBuzzTree_noInts(){
        Tree<Integer> noIntTree = new Tree<>();
        noIntTree.root = new Node("hi");
        noIntTree.root.leftNode = new Node(1);
        noIntTree.root.rightNode = new Node("yo");
        noIntTree.root.leftNode.leftNode = new Node(2);
        noIntTree.root.leftNode.rightNode = new Node(9);
        noIntTree.root.rightNode.leftNode = new Node(18);
        FizzBuzzTree.fizzBuzzTree(noIntTree);
    }
}