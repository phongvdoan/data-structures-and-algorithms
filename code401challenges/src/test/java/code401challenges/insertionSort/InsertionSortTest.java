package code401challenges.insertionSort;

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

}