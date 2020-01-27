package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

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
        System.out.println(testTree.preorder().toString());
        Object[] expected = new Object[]{5,6,4};
        assertArrayEquals(expected, testTree.preorder());
    }
}