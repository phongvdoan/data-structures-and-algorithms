package code401challenges.mergeSort;

import org.junit.Test;

import java.util.Arrays;

import static code401challenges.mergeSort.MergeSort.merge;
import static code401challenges.mergeSort.MergeSort.mergeSort;
import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMerge() {
        int[] testArrayOne = new int[]{4,6,8,10,15};
        int[] testArrayTwo = new int[]{1,2,3,4,5,6};
        int[] resultArr = merge(testArrayOne,testArrayTwo);
        assertArrayEquals(new int[]{1, 2, 3, 4, 4, 5, 6, 6, 8, 10, 15}, resultArr);
    }

    @Test
    public void testMergeSort() {
        int[] testArrayOne = new int[]{45,33,2,34,78, 32,43,243,12,1};
        int[] resultArr = mergeSort(testArrayOne);
        assertArrayEquals(new int[]{1, 2, 12, 32, 33, 34, 43, 45, 78, 243}, resultArr);
    }
}