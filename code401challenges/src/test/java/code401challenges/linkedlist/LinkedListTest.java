
package code401challenges.linkedlist;

import code401challenges.InvalidInputException;
import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void testLinkedList_instantiationWithEmptyList() {
        LinkedList testList = new LinkedList();
        assertEquals("The empty LinkedList only has the head set at 'null'", null , testList.head);
    }

    @Test public void testLinkedList_insertIntoList() {
        LinkedList testList = new LinkedList();
        assertEquals("The empty LinkedList only has the head set at 'null'", null , testList.head);
        testList.insert(4);
        assertEquals("The list now has value of 4 as the first node", 4, testList.head.value);
        testList.insert(5);
        assertEquals("The list now has value of 5 as the first node", 5, testList.head.value);
        assertNotEquals( "This had the value of 6", 6, testList.head.value);
    }

    @Test public void testLinkedList_includesMethodReturnTrue() throws InvalidInputException {
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(3);
        testList.insert(23);
        testList.insert(28);
        testList.insert(8);

        assertTrue("Value was not included in the LinkedList", testList.includes(3));
    }
    @Test public void testLinkedList_includesMethodReturnFalse() throws InvalidInputException {
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(3);
        testList.insert(23);
        testList.insert(28);
        testList.insert(8);

        assertFalse("Value not included in List is true", testList.includes(5));
    }

    @Test public void testLinkedList_toStringMethod(){
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(3);
        testList.insert(23);
        testList.insert(28);
        testList.insert(8);

        assertEquals("{ 8 } -> { 28 } -> { 23 } -> { 3 } -> { 10 } -> { NULL }", testList.toString());
    }

    @Test public void testLinkedList_insertAndAppendsIntoList() {
        LinkedList testList = new LinkedList();
        assertEquals("The empty LinkedList only has the head set at 'null'", null , testList.head);
        testList.insert(4);
        assertEquals("The list now has value of 4 as the first node", 4, testList.head.value);
        testList.insert(5);
        assertEquals("The list now has value of 5 as the first node", 5, testList.head.value);
        assertNotEquals( "This had the value of 6", 6, testList.head.value);
        testList.append(29);
        assertEquals("{ 5 } -> { 4 } -> { 29 } -> { NULL }", testList.toString());
    }

    @Test public void testLinkedList_insertAndInsertBeforeIntoList() {
        LinkedList testList = new LinkedList();
        assertEquals("The empty LinkedList only has the head set at 'null'", null , testList.head);
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


    @Test public void testLinkedList_DeleteAfterIntoList() {
        LinkedList testList = new LinkedList();
        testList.insert(4);
        testList.insert(5);
        testList.insert(9);
        testList.insert(8);
        testList.insert(22);
        testList.insertAfter(8, 29);
        assertEquals("{ 22 } -> { 8 } -> { 29 } -> { 9 } -> { 5 } -> { 4 } -> { NULL }", testList.toString());
        testList.delete(4);
        assertEquals("{ 22 } -> { 8 } -> { 29 } -> { 9 } -> { 5 } -> { NULL }", testList.toString());
    }


}
