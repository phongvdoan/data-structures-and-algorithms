package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter shelter;

    @Before
    public void setup(){
        shelter = new AnimalShelter();
    }
    @Test
    public void enqueue() {
        shelter.enqueue("cat");
        assertEquals("cat was not added to the catQueue", "{ cat } -> { NULL }", shelter.catQueue.toString());
        assertEquals("cat got added to dogQueue", "{ NULL }", shelter.dogQueue.toString());

        shelter.enqueue("dog");
        assertEquals("dog got added to catQueue", "{ cat } -> { NULL }", shelter.catQueue.toString());
        assertEquals("dog did not get added to dogQueue", "{ dog } -> { NULL }", shelter.dogQueue.toString());

        shelter.enqueue("Dog");
        shelter.enqueue("DOg");
        shelter.enqueue("DOG");
        assertEquals("dog got added to catQueue", "{ cat } -> { NULL }", shelter.catQueue.toString());
        assertEquals("dog did not get added to dogQueue", "{ dog } -> { dog } -> { dog } -> { dog } -> { NULL }", shelter.dogQueue.toString());

        shelter.enqueue("Cat");
        shelter.enqueue("CAt");
        shelter.enqueue("CAT");
        assertEquals("cat was not added to the catQueue", "{ cat } -> { cat } -> { cat } -> { cat } -> { NULL }", shelter.catQueue.toString());
        assertEquals("cat got added to dogQueue", "{ dog } -> { dog } -> { dog } -> { dog } -> { NULL }", shelter.dogQueue.toString());
    }

    @Test
    public void dequeue() {
        shelter.enqueue("Cat");
        shelter.enqueue("CAt");
        shelter.enqueue("CAT");
        shelter.enqueue("Dog");
        shelter.enqueue("DOg");
        shelter.enqueue("DOG");

        assertEquals("enqueue broke", "{ cat } -> { cat } -> { cat } -> { NULL }", shelter.catQueue.toString());
        assertEquals("enqueue broke", "{ dog } -> { dog } -> { dog } -> { NULL }", shelter.dogQueue.toString());

        shelter.dequeue("cat");
        assertEquals("cat was not removed from the catQueue", "{ cat } -> { cat } -> { NULL }", shelter.catQueue.toString());
        assertEquals("dog got removed", "{ dog } -> { dog } -> { dog } -> { NULL }", shelter.dogQueue.toString());

        shelter.dequeue("dog");
        assertEquals("cat got removed", "{ cat } -> { cat } -> { NULL }", shelter.catQueue.toString());
        assertEquals("dog was not removed from the catQueue", "{ dog } -> { dog } -> { NULL }", shelter.dogQueue.toString());

    }

    @Test
            (expected = IllegalArgumentException.class)
    public void enqueue_OtherThanCatOrDog() {
        shelter.enqueue("asdf");
    }

    @Test
    public void dequeue_OtherThanCatOrDog() {
        assertNull("did not return null" ,shelter.dequeue("asdf"));
    }
}