package code401challenges.TreeIntersection;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;

import static code401challenges.TreeIntersection.TreeIntersection.tree_intersection;
import static org.junit.Assert.*;

public class TreeIntersectionTest {

    Tree<Integer> testTree;
    Tree<Integer> testTreeTwo;

    @Before
    public void setup(){
        testTree = new Tree<>();
        testTree.root = new Node<>(150);
        testTree.root.leftNode = new Node<>(100);
        testTree.root.rightNode = new Node<>(250);
        testTree.root.leftNode.leftNode = new Node<>(75);
        testTree.root.leftNode.rightNode = new Node<>(160);
        testTree.root.rightNode.leftNode = new Node<>(200);
        testTree.root.rightNode.rightNode = new Node<>(350);
        testTree.root.leftNode.rightNode.leftNode = new Node<>(125);
        testTree.root.leftNode.rightNode.rightNode = new Node<>(175);
        testTree.root.rightNode.rightNode.leftNode = new Node<>(300);
        testTree.root.rightNode.rightNode.rightNode = new Node<>(500);
        testTreeTwo = new Tree<>();
        testTreeTwo.root = new Node<>(45);
        testTreeTwo.root.leftNode = new Node<>(100);
        testTreeTwo.root.rightNode = new Node<>(600);
        testTreeTwo.root.leftNode.leftNode = new Node<>(15);
        testTreeTwo.root.leftNode.rightNode = new Node<>(160);
        testTreeTwo.root.rightNode.leftNode = new Node<>(200);
        testTreeTwo.root.rightNode.rightNode = new Node<>(350);
        testTreeTwo.root.leftNode.rightNode.leftNode = new Node<>(125);
        testTreeTwo.root.leftNode.rightNode.rightNode = new Node<>(175);
        testTreeTwo.root.rightNode.rightNode.leftNode = new Node<>(4);
        testTreeTwo.root.rightNode.rightNode.rightNode = new Node<>(500);
    }
    @Test
    public void testTree_intersection() {
        Integer[] result = tree_intersection(testTree,testTreeTwo);
        Integer[] expected = new Integer[]{100, 160, 125, 175, 200, 350, 500};
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTree_intersection_WithDuplicateValuesInOneTree() {
        testTree = new Tree<>();
        testTree.root = new Node<>(150);
        testTree.root.leftNode = new Node<>(100);
        testTree.root.rightNode = new Node<>(250);
        testTree.root.leftNode.leftNode = new Node<>(75);
        testTree.root.leftNode.rightNode = new Node<>(160);
        testTree.root.rightNode.leftNode = new Node<>(200);
        testTree.root.rightNode.rightNode = new Node<>(350);
        testTree.root.leftNode.rightNode.leftNode = new Node<>(125);
        testTree.root.leftNode.rightNode.rightNode = new Node<>(175);
        testTree.root.rightNode.rightNode.leftNode = new Node<>(300);
        testTree.root.rightNode.rightNode.rightNode = new Node<>(150);
        testTreeTwo = new Tree<>();
        testTreeTwo.root = new Node<>(45);
        testTreeTwo.root.leftNode = new Node<>(100);
        testTreeTwo.root.rightNode = new Node<>(600);
        testTreeTwo.root.leftNode.leftNode = new Node<>(15);
        testTreeTwo.root.leftNode.rightNode = new Node<>(160);
        testTreeTwo.root.rightNode.leftNode = new Node<>(200);
        testTreeTwo.root.rightNode.rightNode = new Node<>(350);
        testTreeTwo.root.leftNode.rightNode.leftNode = new Node<>(125);
        testTreeTwo.root.leftNode.rightNode.rightNode = new Node<>(175);
        testTreeTwo.root.rightNode.rightNode.leftNode = new Node<>(4);
        testTreeTwo.root.rightNode.rightNode.rightNode = new Node<>(500);
        Integer[] result = tree_intersection(testTree,testTreeTwo);
        Integer[] expected = new Integer[]{100, 160, 125, 175, 200, 350};
        assertArrayEquals(expected, result);
    }

    @Test
            (expected = NoSuchElementException.class)
    public void testTree_intersection_EmptyTree() {
        Tree<Integer> testTree = new Tree<>();
        Tree<Integer> testTreeTwo = new Tree<>();
        Integer[] result = tree_intersection(testTree,testTreeTwo);

    }
    @Test
    public void testTree_intersection_NoIntersection() {
        Tree<Integer> testTree = new Tree<>();
        testTree.root = new Node<>(150);
        Tree<Integer> testTreeTwo = new Tree<>();
        testTreeTwo.root = new Node<>(99);
        Integer[] result = tree_intersection(testTree,testTreeTwo);
        Integer[] expected = new Integer[]{};
        assertArrayEquals(expected, result);
    }

}