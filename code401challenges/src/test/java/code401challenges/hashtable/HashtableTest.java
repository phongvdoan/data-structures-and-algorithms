package code401challenges.hashtable;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class HashtableTest {

    Hashtable<String> testHashTable;

    @Before
    public void setup(){
        testHashTable = new Hashtable<>(1024);
        testHashTable.add("Phong", "is tired");
        testHashTable.add("Nicholas", "is feeling better");
        testHashTable.add("Maya", "partner");
        testHashTable.add("Janai", "spawn");
        testHashTable.add("Mani", "spawn");
    }

    @Test
    public void testAddToGet() {
       testHashTable.add("bob", "Robert");

        String valueOfNicholas = testHashTable.get("Nicholas");
        assertEquals("is feeling better", valueOfNicholas);
        String valueOfBob = testHashTable.get("bob");
        assertEquals("Robert", valueOfBob);
        String valueOfMani = testHashTable.get("Mani");
        assertEquals("spawn", valueOfMani);
    }

    @Test
    public void testHash() {
        String testString = "Phong";
        int hashResult = 164;
        assertEquals(hashResult, testHashTable.hash(testString));
    }

    @Test
    public void testGet_null() {

        assertNull(testHashTable.get("Iphone"));
    }

    @Test
    public void testContains_returnTrue() {
        assertTrue(testHashTable.contains("Phong"));
    }

    @Test
    public void testContains_returnFalse() {
        assertFalse(testHashTable.contains("BANG"));
    }
}