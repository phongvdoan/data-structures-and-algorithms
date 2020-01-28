
package code401challenges.linkedlist;

import code401challenges.linkedList.LinkedList;
import org.apache.commons.math3.exception.OutOfRangeException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList testList;

    @Test
    public void testLinkedList_instantiationWithEmptyList() {
        LinkedList testList = new LinkedList();
        assertNull("The empty LinkedList only has the head set at 'null'", testList.head);
    }

    @Test
    public void testLinkedList_insertIntoList() {
        LinkedList testList = new LinkedList();
        assertNull("The empty LinkedList only has the head set at 'null'", testList.head);
        testList.insert(4);
        assertEquals("The list now has value of 4 as the first node", 4, testList.head.value);
        testList.insert(5);
        assertEquals("The list now has value of 5 as the first node", 5, testList.head.value);
        assertNotEquals( "This had the value of 6", 6, testList.head.value);
    }

    @Test
    public void testLinkedList_includesMethodReturnTrue(){
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(3);
        testList.insert(23);
        testList.insert(28);
        testList.insert(8);

        assertTrue("Value was not included in the LinkedList", testList.includes(3));
    }
    @Test
    public void testLinkedList_includesMethodReturnFalse() {
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(3);
        testList.insert(23);
        testList.insert(28);
        testList.insert(8);

        assertFalse("Value not included in List is true", testList.includes(5));
    }

    @Test
    public void testLinkedList_toStringMethod(){
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(3);
        testList.insert(23);
        testList.insert(28);
        testList.insert(8);

        assertEquals("{ 8 } -> { 28 } -> { 23 } -> { 3 } -> { 10 } -> { NULL }", testList.toString());
    }

    @Test
    public void testLinkedList_insertAndAppendsIntoList() {
        LinkedList testList = new LinkedList();
        assertNull("The empty LinkedList only has the head set at 'null'", testList.head);
        testList.insert(4);
        assertEquals("The list now has value of 4 as the first node", 4, testList.head.value);
        testList.insert(5);
        assertEquals("The list now has value of 5 as the first node", 5, testList.head.value);
        assertNotEquals( "This had the value of 6", 6, testList.head.value);
        testList.append(29);
        assertEquals("{ 5 } -> { 4 } -> { 29 } -> { NULL }", testList.toString());
    }

    @Test
    public void testLinkedList_insertAndInsertBeforeIntoList() {
        LinkedList testList = new LinkedList();
        assertNull("The empty LinkedList only has the head set at 'null'", testList.head);
        testList.insert(4);
        assertEquals("The list now has value of 4 as the first node", 4, testList.head.value);
        testList.insert(5);
        assertEquals("The list now has value of 5 as the first node", 5, testList.head.value);
        assertNotEquals( "This had the value of 6", 6, testList.head.value);
        testList.insert(9);
        testList.insert(8);
        testList.insert(22);
        testList.insertBefore(4, 29);
        assertEquals("{ 22 } -> { 8 } -> { 9 } -> { 5 } -> { 29 } -> { 4 } -> { NULL }", testList.toString());
    }


    @Test
    public void testLinkedList_DeleteAfterIntoList() {
        LinkedList testList = new LinkedList();
        testList.insert(4);
        testList.insert(5);
        testList.insert(9);
        testList.insert(8);
        testList.insert(22);
        testList.insertAfter(8, 29);
        testList.insertAfter(4, 29);
        testList.insertAfter(22, 29);
        assertEquals("{ 22 } -> { 29 } -> { 8 } -> { 29 } -> { 9 } -> { 5 } -> { 4 } -> { 29 } -> { NULL }", testList.toString());
        testList.delete(4);
        assertEquals("{ 22 } -> { 29 } -> { 8 } -> { 29 } -> { 9 } -> { 5 } -> { 29 } -> { NULL }", testList.toString());
    }

    @Before
    public void setup(){
        testList = new LinkedList();
        testList.insert(2);
        testList.insert(8);
        testList.insert(3);
        testList.insert(1);
    }

    @Test
    public void testLinkedList_0thFromTheLastMethod() {

        assertEquals("{ 1 } -> { 3 } -> { 8 } -> { 2 } -> { NULL }", testList.toString());
        assertEquals("The 0 value did not return 2", 2, testList.kthFromEnd(0));

    }

    @Test
    public void testLinkedList_2thFromTheLastMethod() {
        assertEquals("The 2nd value from the end was not 3", 3,testList.kthFromEnd(2));
    }

    @Test
            (expected = OutOfRangeException.class)
    public void testLinkedList_greaterThanLengthFromLast(){
       testList.kthFromEnd(10);

    }

    @Test
            (expected = NullPointerException.class)
    public void testLinkedList_negativeValueFromLast(){
        testList.kthFromEnd(-1);

    }

    @Before
    public void setuptwo(){
        testList = new LinkedList();
        testList.insert(2);
    }

    @Test
    public void testLinkedList_1tstFromTheLastMethod() {
        assertEquals("The first value from the end was not 2", 2,testList.kthFromEnd(0));
    }

    @Test
            (expected = OutOfRangeException.class)
    public void testLinkedList_greaterThanLengthFromLastTwo(){
        testList.kthFromEnd(10);

    }

    @Test
            (expected = NullPointerException.class)
    public void testLinkedList_negativeValueFromLastTwo(){
        testList.kthFromEnd(-1);

    }
    
    @Test
    public void testMergeLists(){
        LinkedList testOne = new LinkedList();
        testOne.insert(2);
        testOne.insert(3);
        testOne.insert(1);

        LinkedList testTwo = new LinkedList();
        testTwo.insert(4);
        testTwo.insert(9);
        testTwo.insert(5);

       assertEquals("It is not merging!", "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { 4 } -> { NULL }", LinkedList.mergeList(testOne,testTwo).toString());
    }

    @Test
    public void testMergeListsTwo(){
        LinkedList testOne = new LinkedList();
        testOne.insert(3);
        testOne.insert(1);

        LinkedList testTwo = new LinkedList();
        testTwo.insert(4);
        testTwo.insert(9);
        testTwo.insert(5);

        assertEquals("It is not merging!", "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 4 } -> { NULL }", LinkedList.mergeList(testOne,testTwo).toString());
    }

    @Test
    public void testMergeListsThree(){
        LinkedList testOne = new LinkedList();
        testOne.insert(2);
        testOne.insert(3);
        testOne.insert(1);

        LinkedList testTwo = new LinkedList();
        testTwo.insert(9);
        testTwo.insert(5);

        assertEquals("It is not merging!", "{ 1 } -> { 5 } -> { 3 } -> { 9 } -> { 2 } -> { NULL }", LinkedList.mergeList(testOne,testTwo).toString());
    }

    @Test
    public void testMergeLists_emptyLinkedListFirstParams(){
        LinkedList testOne = new LinkedList();

        LinkedList testTwo = new LinkedList();
        testTwo.insert(9);
        testTwo.insert(5);

        assertEquals("It is not merging!", "{ 5 } -> { 9 } -> { NULL }", LinkedList.mergeList(testOne,testTwo).toString());
    }

    @Test
    public void testMergeLists_emptyLinkedListSecondParams(){
        LinkedList testOne = new LinkedList();
        testOne.insert(9);
        testOne.insert(5);

        LinkedList testTwo = new LinkedList();

        assertEquals("It is not merging!", "{ 5 } -> { 9 } -> { NULL }", LinkedList.mergeList(testOne,testTwo).toString());
    }

}
