package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree testTree;

    @Before
    public void setup(){
        testTree = new BinarySearchTree();
        testTree.add(5);
        testTree.add(6);
        testTree.add(4);
    }

    @Test
    public void testAdd_threeValues() {
        assertEquals( "The root value was not inserted",5, testTree.root.value);
        assertEquals( "The right node value was not inserted",6,testTree.root.rightNode.value);
        assertEquals( "The left node value was not inserted",4,testTree.root.leftNode.value);
    }

    @Test
    public void testContainsMethod() {
        assertTrue("Contains method did not work", testTree.contains(5));
        assertFalse("Contains method did not work", testTree.contains(9));
    }

    @Test
    public void testPreOrder() {
        testTree.add(10);
        testTree.add(1);
        testTree.add(99);
        System.out.println(Arrays.toString(testTree.preOrder()));
        Integer[] expected = new Integer[]{5,4,1, 6, 10, 99};
        assertEquals(Arrays.toString(expected),Arrays.toString(testTree.preOrder()));
    }

    @Test
    public void testInOrder() {
        testTree.add(10);
        testTree.add(1);
        testTree.add(99);
        System.out.println(Arrays.toString(testTree.inOrder()));
        Integer[] expected = new Integer[]{1, 4, 5, 6, 10, 99};
        assertEquals(Arrays.toString(expected),Arrays.toString(testTree.inOrder()));
    }

    @Test
    public void testPostOrder() {
        testTree.add(10);
        testTree.add(1);
        testTree.add(99);
        System.out.println(Arrays.toString(testTree.postOrder()));
        Integer[] expected = new Integer[]{1, 4, 99, 10, 6, 5};
        assertEquals(Arrays.toString(expected),Arrays.toString(testTree.postOrder()));
    }

    @Test
            (expected = NoSuchElementException.class)
    public void testExceptionHandler(){
        BinarySearchTree emptyTree = new BinarySearchTree();
        emptyTree.preOrder();
    }

}