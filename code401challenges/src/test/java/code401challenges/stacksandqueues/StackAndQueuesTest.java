package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackAndQueuesTest {
    Stack testStack;
    Queue testQueue;

    @Before
    public void setUpStack() {
        testStack = new Stack();
        testStack.push(3);
        testStack.push(4);
        testStack.push(5);
    }

    @Test
    public void testPushMultiInStack() {

        assertEquals("No push was involved", "{ 5 } \n" +
                " { 4 } \n" +
                " { 3 } \n" +
                " { NULL }", testStack.toString());
    }

    @Test
    public void testPopFromStack(){
        int poppedValue = testStack.pop();
        assertEquals("No pop was involved", "{ 4 } \n" +
                " { 3 } \n" +
                " { NULL }", testStack.toString());
        assertEquals(" The value was not the top", 5, poppedValue);

    }

    @Test
    public void emptyStackAfterMultiplePops(){
        assertEquals("No push was involved", "{ 5 } \n" +
                " { 4 } \n" +
                " { 3 } \n" +
                " { NULL }", testStack.toString());
        testStack.pop();
        testStack.pop();
        testStack.pop();
        assertEquals("It was not empty", "{ NULL }", testStack.toString());
        assertTrue("It is not empty", testStack.isEmpty());
    }

    @Test
    public void peekTheNextItemOnTheStack() {
        assertEquals("No push was involved", "{ 5 } \n" +
                " { 4 } \n" +
                " { 3 } \n" +
                " { NULL }", testStack.toString());
        int peekedValue = testStack.peek();
        assertEquals(" The value was not the top", 5, peekedValue);
        assertEquals("No push was involved", "{ 5 } \n" +
                " { 4 } \n" +
                " { 3 } \n" +
                " { NULL }", testStack.toString());
    }

    @Before
    public void setUpQueue(){
        testQueue = new Queue();
        testQueue.enqueue(5);
        testQueue.enqueue(4);
        testQueue.enqueue(3);
    }

    @Test
    public void enqueueMultiIntoQueue(){
        testQueue.enqueue(2);
        testQueue.enqueue(3);
        assertEquals("No value got enqueued", "{ 5 } -> { 4 } -> { 3 } -> { 2 } -> { 3 } -> { NULL }", testQueue.toString());

    }

    @Test
    public void dequeueOutOfQueue(){
        int dequeuedValue = testQueue.dequeue();
        assertEquals("Did not dequeued front value", 5, dequeuedValue);
    }

    @Test
    public void peekIntoQueue(){
        enqueueMultiIntoQueue();
        int peekedValue = testQueue.peek();
        assertEquals("Did not peek correct value", 5,peekedValue);
        assertEquals("Peek Method removed a value", "{ 5 } -> { 4 } -> { 3 } -> { 2 } -> { 3 } -> { NULL }", testQueue.toString());
    }

    @Test
    public void emptyQueueAfterMultipleDequeues(){
        enqueueMultiIntoQueue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        testQueue.dequeue();
        assertEquals("No value got dequeued", "{ NULL }", testQueue.toString());
        assertTrue("It is not empty", testQueue.isEmpty());
    }



}
