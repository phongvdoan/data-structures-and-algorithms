package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeTest {

    static Tree<Integer> testTree;

    @Before
    public void setup(){
        testTree = new Tree<>();
        testTree.root = new Node<>(5);
        testTree.root.leftNode = new Node<>(1);
        testTree.root.rightNode = new Node<>(2);
        testTree.root.leftNode.leftNode = new Node<>(3);
        testTree.root.leftNode.rightNode = new Node<>(4);
        testTree.root.rightNode.leftNode = new Node<>(5);
        testTree.root.rightNode.rightNode = new Node<>(6);
    }


    @Test
    public void testPreOrder() {

        Integer[] expected = new Integer[]{5, 1, 3, 4, 2, 5, 6};
        assertEquals(Arrays.toString(expected),Arrays.toString(testTree.preOrder()));
    }

    @Test
    public void TestInOrder() {
        Integer[] expected = new Integer[]{3, 1, 4, 5, 5, 2, 6};
        assertEquals(Arrays.toString(expected),Arrays.toString(testTree.inOrder()));
    }

    @Test
    public void testPostOrder() {
        Integer[] expected = new Integer[]{3, 4, 1, 5, 6, 2, 5};
        assertEquals(Arrays.toString(expected),Arrays.toString(testTree.postOrder()));
    }

    @Test
    public void testBreadthFirstApproach(){
        Integer[] expected = new Integer[]{5, 1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, testTree.breathFirstTraversal().toArray() );
    }

    @Test
    public void testBreadthFirstApproach_Unbalanced(){
        Tree<Integer> testTree = new Tree<>();
        testTree.root = new Node<>(2);
        testTree.root.leftNode = new Node<>(7);
        testTree.root.rightNode = new Node<>(5);
        testTree.root.leftNode.leftNode = new Node<>(2);
        testTree.root.leftNode.rightNode = new Node<>(6);
        testTree.root.rightNode.rightNode = new Node<>(9);
        testTree.root.leftNode.rightNode.leftNode = new Node<>(5);
        testTree.root.leftNode.rightNode.rightNode = new Node<>(11);
        testTree.root.rightNode.rightNode.leftNode = new Node<>(4);
        Integer[] expected = new Integer[]{2, 7, 5, 2, 6, 9, 5, 11, 4};
        assertArrayEquals(expected, testTree.breathFirstTraversal().toArray() );
    }


}