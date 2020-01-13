
package code401challenges.linkedlist;

import code401challenges.linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test public void testLinkedList_instantiationWithEmptyList() {
        LinkedList testList = new LinkedList();
        assertEquals("The empty LinkedList only has the head set at 'null'", null , testList.head);
    }

    @Test public void testLinkedList_insertIntoList () {
        LinkedList testList = new LinkedList();
        assertEquals("The empty LinkedList only has the head set at 'null'", null , testList.head);
        testList.insert(4);
        assertEquals("The list now has value of 4 as the first node", "The current values are: { 4 } -> {  NULL  }", testList.toString());
        testList.insert(5);
        assertEquals("The list now has value of 5 as the first node", "The current values are: { 5 } -> { 4 } -> {  NULL  }", testList.toString());
    }

    @Test public void testLinkedList_includesMethodReturnTrue(){
        LinkedList testList = new LinkedList();
        testList.insert(10);
        testList.insert(3);
        testList.insert(23);
        testList.insert(28);
        testList.insert(8);

        assertTrue("Value was not included in the LinkedList", testList.includes(3));
    }
    @Test public void testLinkedList_includesMethodReturnFalse(){
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

        assertEquals("The current values are: { 8 } -> { 28 } -> { 23 } -> { 3 } -> { 10 } -> {  NULL  }", testList.toString());
    }


}
