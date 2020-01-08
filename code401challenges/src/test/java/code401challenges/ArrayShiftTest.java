package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

        @Test public void testInsertShiftArrayMethod() {
            int[] testDataOne = new int[]{2, 4, 6, 8};
            int[] outputArr = new int[]{2, 4, 5, 6, 8};
           
            assertArrayEquals(outputArr, code401challenges.ArrayShift.insertShiftArray(testDataOne, 5));
            
        }
        @Test public void testTwoInsertShiftArrayMethod() {
             int[] testDataTwo = new int[]{4, 8, 15, 23, 42};
            int[] outputArr = new int[]{4, 8, 15, 16, 23, 42};

            assertArrayEquals(outputArr, code401challenges.ArrayShift.insertShiftArray(testDataTwo, 16));
        }

        @Test public void testFailureShiftArray() {
            int[] testDataThree = new int[] {1,2,3,4,5,6};
            int[] outputArr = new int[]{1, 2, 3, 4, 5, 6, 7};

            assertNotEquals(outputArr, code401challenges.ArrayShift.insertShiftArray(testDataThree, 7));
        }

        @Test public void testOddInputEdgeCaseShiftArrayMethod() {
            int[] testDataFour = new int[] {1,2,3,4,5};
            int[] outputArr = new int[]{1, 2, 3, 10, 4, 5};

            assertNotEquals(outputArr, code401challenges.ArrayShift.insertShiftArray(testDataFour, 10));
        }
    }

