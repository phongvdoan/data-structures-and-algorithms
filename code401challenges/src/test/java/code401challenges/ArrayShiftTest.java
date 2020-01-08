package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

        @Test public void testInsertShiftArrayMethod() {
            int[] testDataOne = new int[]{2, 4, 6, 8};
            int[] testDataTwo = new int[]{4, 8, 15, 23, 42};


            assertEquals("[2, 4, 5, 6, 8]", code401challenges.ArrayShift.insertShiftArray(testDataOne, 5));
            assertEquals("[4, 8, 15, 16, 23, 42]", code401challenges.ArrayShift.insertShiftArray(testDataTwo, 16));
        }

        @Test public void testFailureShiftArray() {
            int[] testDataThree = new int[] {1,2,3,4,5,6};
            assertNotEquals("[1,2,3,4,5,6,7]", code401challenges.ArrayShift.insertShiftArray(testDataThree, 7));
        }
    }

