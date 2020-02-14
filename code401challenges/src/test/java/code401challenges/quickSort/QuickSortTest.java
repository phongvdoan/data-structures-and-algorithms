package code401challenges.quickSort;

import org.junit.Test;

import java.util.Arrays;

import static code401challenges.quickSort.QuickSort.quickSort;
import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] testArr = new int[]{8,4,23,42,16,15};
        quickSort(testArr, 0, testArr.length - 1);
        assertArrayEquals(new int[]{4,8,15,16,23,42}, testArr);
    }

    @Test
    public void testQuickSort_oneElement() {
        int[] testArr = new int[]{8};
        quickSort(testArr, 0, testArr.length - 1);
        assertArrayEquals(new int[]{8}, testArr);
    }

    @Test
    public void testQuickSort_noElement() {
        int[] testArr = new int[]{};
        quickSort(testArr, 0, testArr.length - 1);
        assertArrayEquals(new int[]{}, testArr);
    }

}