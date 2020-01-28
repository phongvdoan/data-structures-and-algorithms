package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {
    PseudoQueue<Integer> testPseudoQue;

    @Before
    public void setup(){
        testPseudoQue = new PseudoQueue<>();
        testPseudoQue.enqueue(20);
        testPseudoQue.enqueue(15);
        testPseudoQue.enqueue(10);
        testPseudoQue.enqueue(5);
    }
    @Test
    public void testPseudoQueue_enqueueMethod(){
        assertEquals("Values are not being queued", "{ 20 } -> { 15 } -> { 10 } -> { 5 } -> { NULL }", testPseudoQue.toString());
    }

    @Test
    public void testPseudoQueue_dequeueMethod(){
         int dequeuedVal = testPseudoQue.dequeue();
        assertEquals("Values are not being dequeued", "{ 15 } -> { 10 } -> { 5 } -> { NULL }", testPseudoQue.toString());
        assertEquals("Value was not returned", 20, dequeuedVal);

    }

    @Test
            (expected = NoSuchElementException.class)
    public void testDequeueMethod_AtNull(){
        testPseudoQue.dequeue();
        testPseudoQue.dequeue();
        testPseudoQue.dequeue();
        testPseudoQue.dequeue();
        testPseudoQue.dequeue();

    }
}
