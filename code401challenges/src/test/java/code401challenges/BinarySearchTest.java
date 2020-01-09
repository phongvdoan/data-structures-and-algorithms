package code401challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void testBinarySearchMethod(){
        int[] testArr = {4,8,15,16,23,42};
        int testSearchKey = 15;
        int testResult = 2;

        assertEquals(testResult, BinarySearch.BinarySearch(testArr,testSearchKey));
    }

    @Test public void testTwoBinarySearchMethod() {
        int[] testArr = {11,22,33,44,55,66,77};
        int testSearchKey = 90;
        int testResult = -1;

        assertEquals(testResult, BinarySearch.BinarySearch(testArr,testSearchKey));
    }

    @Test public void testThreeBinarySearchMethod() {
        int[] testArr = {1,2,3,4,5,6,7};
        int testSearchKey = -1;
        int testResult = -1;

        assertEquals(testResult, BinarySearch.BinarySearch(testArr,testSearchKey));
    }
    @Test public void testDuplicateBinarySearchMethod() {
        int[] testArr = {1,2,2,3,4,5,6,7};
        int testSearchKey = 2;
        int testResult = 1;

        assertEquals(testResult, BinarySearch.BinarySearch(testArr,testSearchKey));
    }

    @Test public void testNotEqualsBinarySearchMethod() {
        int[] testArr = {1,2,2,3,4,5,6,7};
        int testSearchKey = 2;
        int testResult = 5;

        assertNotEquals(testResult, BinarySearch.BinarySearch(testArr,testSearchKey));
    }

}
