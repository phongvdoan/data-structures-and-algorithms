package code401challenges.insertionSort;

import org.apache.commons.math3.exception.NullArgumentException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static code401challenges.insertionSort.InsertionSort.insertionSort;
import static org.junit.Assert.*;

public class InsertionSortTest {

    int[] testArr;

    @Before
    public void setup(){
        testArr = new int[]{8,4,23,42,16,15};
    }

    @Test
    public void testInsertionSort() {
        int[] resultArr = new int[]{4, 8, 15, 16, 23, 42};
        insertionSort(testArr);
        assertArrayEquals(resultArr, testArr);
    }

    @Test
    public void testInsertionSort_negativeValues() {
        testArr = new int[]{20,18,12,8,5,-2};
        int[] resultArr = new int[]{-2, 5, 8, 12, 18, 20};
        insertionSort(testArr);
        assertArrayEquals(resultArr, testArr);
    }

    @Test
    public void testInsertionSort_duplicateValues() {
        testArr = new int[]{5,12,7,5,5,7};
        int[] resultArr = new int[]{5, 5, 5, 7, 7, 12};
        insertionSort(testArr);
        assertArrayEquals(resultArr, testArr);
    }

    @Test
            (expected = NullArgumentException.class)
    public void testInsertionSort_noValues() {
        testArr = new int[]{};
        insertionSort(testArr);
    }
}